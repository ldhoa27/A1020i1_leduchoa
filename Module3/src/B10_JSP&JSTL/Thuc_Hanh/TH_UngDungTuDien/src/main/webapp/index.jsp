<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        input[type=text]{
            width: 300px;
            font-size: 16px;
            border: 1px solid black;
            padding: 10px 20px 10px 20px;
        }
        #submit{
            border-radius: 2px;
            padding: 10px 30px;
            font-size: 16px;
        }
    </style>
</head>
<body>
<h2>Vietnamese Dictionary</h2>
    <form action="dictionary" method="post">
        <input type="text" name="txtSearch" placeholder="Enter your word:" />
        <input type="submit" id="submit" value="Search"/>
    </form>
</body>
</html>