<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        input[type=text]{
            width: 300px;
            font-size: 16px;
            border: 2px solid #CCC;
            border-radius: 4px;
            padding: 12px 10px 12px 10px;
        }
        #submit{
            border-radius: 2px;
            padding: 10px 32px;
            font-size: 16px;
        }
    </style>
</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form action="/translate" method="post">
    <input type="text" name="txtSerach" placeholder="Enter your word:" />
    <input type="submit" id="submit" value="Search" />
</form>
</body>
</html>