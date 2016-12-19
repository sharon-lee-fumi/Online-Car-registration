<%-- 
    Document   : searchForm
    Created on : Nov 24, 2016, 10:53:22 PM
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
        <p>Search cars</p>
        <form action="Search" method="post">
            <table>
                <tr>
                    <td>Model:</td>
                    <td><input type="text" name="model"></td>
                </tr>
                <tr>
                    <td>Year:</td>
                    <td><input type="text" name="year"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Search"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
