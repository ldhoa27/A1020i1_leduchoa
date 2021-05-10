<%@ page import="model.bean.Product" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products List</title>
</head>
<body>
<h2>List student</h2>
<%
    List<Product> productListJSP = (List<Product>) request.getAttribute("productListServlet");
%>
<table>
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Price</td>
        <td>Describe</td>
        <td>Producer</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <%
        for (int i = 0; i < productListJSP.size(); i++) {
    %>
    <tr>
        <td><%=productListJSP.get(i).getId()%></td>
        <td><%=productListJSP.get(i).getName()%></td>
        <td><%=productListJSP.get(i).getPrice()%></td>
        <td><%=productListJSP.get(i).getDescribe()%></td>
        <td><%=productListJSP.get(i).getProducer()%></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
