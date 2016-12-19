<%-- 
    Document   : myLogin
    Created on : Nov 24, 2016, 10:52:49 PM
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
        <h3>Online Car Registration</h3>
        <form action="Validator" method="post">
            <table>
                <tr>
                    <td>User Name:</td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="text" name="password"></td>
                </tr>
                <tr>
                    <td>Status:</td>
                    <td><input type="radio" name="status" value="admin" checked> Admin
                        <input type="radio" name="status" value="sales"> Sales</td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
