<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Custom Login</title>
</head>
<body>

    <h2>My Custom Login Page</h2>

    <c:if test="${param.error != null}">
        <p style="color: red;">Invalid username or password.</p>
    </c:if>

    <c:if test="${param.logout != null}">
        <p style="color: green;">You have been successfully logged out.</p>
    </c:if>

    <form action="${pageContext.request.contextPath}/perform_login" method="POST">
        <p>
            Username: <input type="text" name="username" />
        </p>
        <p>
            Password: <input type="password" name="password" />
        </p>
        <input type="submit" value="Login" />
    </form>

</body>
</html>