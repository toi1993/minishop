<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="header.jsp"/>
</head>
<body>
    <form method="post" action="">
       Email: <input type="text" name="tendangnhap" value=""/> <b/>
       Pass: <input type="password" name="matkhau" value=""/>
        <button type="submit" class="btn btn-default">Submit</button>
        <span>${kiemtradangnhap}</span>
    </form>
</body>
</html>
