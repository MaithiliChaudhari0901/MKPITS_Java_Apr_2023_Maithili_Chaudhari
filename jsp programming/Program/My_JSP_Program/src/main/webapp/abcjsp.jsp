
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title> example </title>
    </head>
    <body>
<c:set var="marks" scope="application" value="45">
</c:set>
    <c:out value="${marks}">
    </c:out>
</body>
</html>
