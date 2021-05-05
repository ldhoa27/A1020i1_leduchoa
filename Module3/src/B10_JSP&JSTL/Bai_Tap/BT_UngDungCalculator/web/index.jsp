<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
      <style>
          table{
              border: 1px solid #171515;
          }
      </style>
  </head>
  <body>
  <h2>Simple Calculator</h2>
  <form action="calculator" method="post">
    <table>
      <tr>
        <td>First operand:</td>
        <td><input type="text" name="first" value=""></td>
      </tr>
      <tr>
      <td>Operator:</td>
        <td>
          <select name="operator">
            <option value="+">Addition</option>
            <option value="-">Subtraction</option>
            <option value="*">Multiplication</option>
            <option value="/">Division</option>
          </select>
        </td>
      </tr>
      <tr>
        <td>Second operand:</td>
        <td><input type="text" name="second" value=""></td>
      </tr>
      <tr>
        <td><input type="submit" value="Calculator"></td>
      </tr>
    </table>
  </form>
  <c:
  </body>
</html>
