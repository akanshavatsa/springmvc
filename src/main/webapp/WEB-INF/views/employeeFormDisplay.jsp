    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
        pageEncoding="ISO-8859-1"%>

          <%@page isELIgnored="false" %>
    <!doctype html>
    <html lang="en">
      <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bootstrap demo</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
      </head>
      <body>

        <div class="container mt-5">
        <h2 class="text-center"> ${Header} </h2>
        <p2>  ${Desc} </p2>
        <form action="processForm" method="post">
          <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Email address</label>
            <input type="email"
            class="form-control"
            id="exampleInputEmail1"
            aria-describedby="emailHelp" name="email">
            <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
          </div>

          <div class="mb-3">
                      <label for="userName" class="form-label">Username</label>
                      <input type="text"
                      class="form-control"
                      id="userName"
                      aria-describedby="emailHelp"
                      name="userName">

                    </div>

          <div class="mb-3">
            <label for="projectName" class="form-label">Project Name</label>
            <input type="text"
            class="form-control"
            id="projectName"
            name="projectName">
          </div>

          <div class="mb-3">
                                <label for="managerName" class="form-label">Manager Name</label>
                                <input type="text"
                                class="form-control"
                                id="managerName"
                                aria-describedby="emailHelp"
                                name="managerName">

                              </div>


          <div class="text-center">
          <button type="submit" class="btn btn-primary">Submit</button>
          </div>
        </form>
        </div>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
      </body>
    </html>