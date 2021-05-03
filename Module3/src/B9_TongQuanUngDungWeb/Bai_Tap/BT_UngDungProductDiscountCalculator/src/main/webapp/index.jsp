<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <div style="margin-left: 400px; width: 600px; border: 1px solid black">
    <h2 style="font-size: 18px; text-align: center">Calculator Discount Product</h2>
    <form method="post" action="/calculator">
        <label style="margin: 30px">Product Description: </label>
        <input type="text" name="descrption" value="" style="margin-left: 32px; margin-top: 20px"/><br/>
        <label style="margin: 30px">Product Price (USD): </label>
        <input type="text" name="price" value="" style="margin-left: 27px; margin-top: 20px"/><br/>
        <label style="margin: 30px">Discount Percent (%): </label>
        <input type="text" name="discount_percent" value="" style="margin-left: 23px; margin-top: 20px"/><br/>
        <input type="submit" id="submit" value="calculate discount" style="margin-left: 250px; margin-top: 20px"/>
    </form>
    </div>
</body>
</html>