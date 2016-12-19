<%-- 
    Document   : carForm
    Created on : Nov 24, 2016, 10:53:05 PM
    Author     : Xiaowen Li
--%>
<%@include file="/header.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cars - Xiaowen</title>
        <script>
            function errorCheck()
            {
                if ("${msg}" != "")
                {
                    alert("${msg}");
                }
            }
        </script>
    </head>
    <body onload="errorCheck()">
        <h3>Online Car registration</h3>
        <p>Add a new car</p>
        <form action="AddCar" method="post">
            <table>
                <tr>
                    <td>Car ID:</td>
                    <td><input type="text" name="carId"></td>
                </tr>
                <tr>
                    <td>Model:</td>
                    <td><input type="text" name="model"></td>
                </tr>
                <tr>
                    <td>Year:</td>
                    <td><input type="text" name="year"></td>
                </tr>
                <tr>
                    <td>Color:</td>
                    <td><input type="text" name="color"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Add"></td>
                    <td></td>
                </tr>
            </table>
        </form>
        <form action="adminMenu.jsp" method="post">
            <input type="submit" value="Exit">
        </form>
    </body>
</html>
