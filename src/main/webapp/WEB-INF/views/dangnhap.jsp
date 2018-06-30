<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="header.jsp"/>
</head>
<body>

<%--foreach--%>
<c:forEach items="${listNhanVien}" var="nv">
    <c:out value="${nv.tenNhanVien}"/><br/>
    <c:out value="${nv.tuoi}"/>
</c:forEach>

<%--End foreach--%>
</body>
</html>
