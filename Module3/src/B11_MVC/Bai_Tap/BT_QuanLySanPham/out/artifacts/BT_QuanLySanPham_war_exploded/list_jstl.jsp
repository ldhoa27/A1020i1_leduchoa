<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List product JSTL</title>
</head>
<body>
    <h2>List product JSTL</h2>
    <a href="/product?actionUser=create">Create product</a>
    <table border="1">
        <tr>
            <td>Id</td>
            <td>Name</td>
            <td>Price</td>
            <td>Describe</td>
            <td>Producer</td>
            <td>Edit</td>
            <td>Delete</td>
        </tr>
        <c:forEach var="product" items="${productListServlet}">
            <tr>
                <td><c:out value="${product.id}"/></td>
                <td><a href="/product?actionUser=view&id=${product.getId()}"/><c:out value="${product.name}"/></td>
                <td><c:out value="${product.price}"/></td>
                <td><c:out value="${product.describe}"/></td>
                <td><c:out value="${product.producer}"/></td>
                <td><a href="/product?actionUser=edit&id=${product.getId()}">edit</a></td>
                <td><a href="/product?actionUser=delete&id=${product.getId()}">delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
