<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<html>
<head>
    <title>Employee List</title>

    <!-- jQuery -->
    <script src="https://code.jquery.com/jquery-3.7.0.min.js"></script>

    <!-- DataTables CSS & JS -->
    <link rel="stylesheet" type="text/css"
          href="https://cdn.datatables.net/1.13.6/css/jquery.dataTables.min.css"/>
    <script src="https://cdn.datatables.net/1.13.6/js/jquery.dataTables.min.js"></script>

    <script>
    $(document).ready(function () {
        var table = $('#employeeTable').DataTable();

        // Edit button click
        $('#employeeTable').on('click', '.edit-btn', function () {
            var empId = $(this).data('id');
            // Redirect to edit form
            window.location.href = '/springmvc/employee/edit/' + empId;
        });

        // Delete button click
        $('#employeeTable').on('click', '.delete-btn', function () {
            var empId = $(this).data('id');
            if (confirm('Are you sure you want to delete this employee?')) {
                $.ajax({
                    url: '/springmvc/employee/delete/' + empId,
                    type: 'DELETE',
                    success: function (result) {
                        // Reload table or remove row
                       //table.row($(this).parents('tr')).remove().draw(false);
                        alert('Employee deleted successfully!');
                        if(result=="success")
                        {
                         window.location.href = '/springmvc/employee/getAllEmployees'
                        }
                    },
                    error: function (err) {
                        alert('Error deleting employee');
                    }
                });
            }
        });
    });
    </script>

</head>
<body>
<h2>Employee List</h2>

<table id="employeeTable" class="display">
    <thead>
    <tr>
        <th>ID</th>
        <th>Email</th>
        <th>User Name</th>
        <th>Project Name</th>
        <th>Mananger Name</th>
        <th> Actions </th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="emp" items="${employees}">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.email}</td>
            <td>${emp.userName}</td>
            <td>${emp.projectName}</td>
            <td>${emp.managerName}</td>
            <td>

                            <!-- Edit button -->
                            <button class="edit-btn" data-id="${emp.id}">Edit</button>
                            <!-- Delete button -->
                            <button class="delete-btn" data-id="${emp.id}">Delete</button>
                        </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
