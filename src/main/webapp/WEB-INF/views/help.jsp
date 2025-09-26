<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>

<html>
<head><title>Spring 7 + JSTL</title></head>
<body>

<h2>Welcome Page</h2>

<c:if test="${not empty user}">
    Hello, <c:out value="${name}" />
</c:if>

<h1>
Roll number ${rollnumber}
</h1>

<ul>
<c:forEach var="item" items="${marks}">
    <li><c:out value="${item}" /></li>
</c:forEach>
</ul>

</body>
</html>