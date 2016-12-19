<%-- 
    Document   : jspAddCar
    Created on : Nov 24, 2016, 10:54:10 PM
    Author     : Xiaowen Li
--%>
<%@include file="/header.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cars - Xiaowen</title>
    </head>
    <body>
        <h3>The car shown below has been registered</h3>
        <p> Model: ${myCarHolder.model} </p>
        <p> Year: ${myCarHolder.year} </p>
        <p> Color: ${myCarHolder.color} </p>
        <form action="adminMenu.jsp" method="post">
            <input type="submit" value="Go Back">
        </form>
    </body>
</html>
