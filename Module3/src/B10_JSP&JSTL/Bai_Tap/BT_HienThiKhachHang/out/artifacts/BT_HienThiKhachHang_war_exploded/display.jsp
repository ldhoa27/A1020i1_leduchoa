
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            font-family: sans-serif;
            margin-left: 600px;
            text-align: center;
        }
        img{
            width: 200px;
            height: 200px;
        }

    </style>
</head>
<body>
<table border="1">
    <h2 style="text-align: center">Danh Sách Khách Hàng</h2>
    <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
    <c:forEach var="customer" items="${list}">
        <tr>
            <td><c:out value="${customer.name}"/></td>
            <td><c:out value="${customer.birth}"/></td>
            <td><c:out value="${customer.address}"/></td>
            <td><img src="${customer.img}"/></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
