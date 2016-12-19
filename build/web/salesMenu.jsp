<%-- 
    Document   : salesMenu
    Created on : Nov 24, 2016, 10:52:29 PM
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
        <h3>Online Car registration</h3>
        <p>Main Menu for sales team members</p>
        <p>1. <a href="searchForm.jsp">Search for Cars</a></p>
        <form action="ShowAllCars" method="post">
            <input type="submit" value="Show all cars">
        </form>
    </body>
</html>
