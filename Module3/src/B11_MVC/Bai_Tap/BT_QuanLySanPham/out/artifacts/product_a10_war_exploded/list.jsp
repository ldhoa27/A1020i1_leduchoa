<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="css/list.css">
</head>
<body>
<a href="/?action=create">Create Product</a>
<h2>Product management</h2>
<form action="/">
    <div id="search">
        <a href="/"> back </a>
        <input type="hidden" name="action" value="search"/>
        <input type="text" name="keywork"/>
        <input type="submit" value="search"/>
    </div>
    <div>
        <table class="table-bordered table">
            <thead>
            <tr>
                <th scope="col">Id</th>
                <th scope="col">Name</th>
                <th scope="col">Price</th>
                <th scope="col">Producer</th>
                <th scope="col">Action</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="product" items="${products}">
                <tr>
                    <td><c:out value="${product.id}"/></td>
                    <td><a href="?action=view&id=${product.getId()}"/><c:out value="${product.name}"/></td>
                    <td><c:out value="${product.price}"/></td>
                    <td><c:out value="${product.producer}"/></td>
                    <td>
                        <a href="?action=delete&id=<c:out value='${product.id}'/>">Delete |</a>
                        <a href="?action=edit&id=<c:out value='${product.id}'/>">Edit</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</form>
</body>
</html>
