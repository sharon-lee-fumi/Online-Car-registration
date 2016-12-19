<%-- 
    Document   : jspSearch
    Created on : Nov 24, 2016, 10:54:26 PM
    Author     : Xiaowen Li
--%>
<%@include file="/header.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cars - Xiaowen</title>
    </head>
    <body>
        <h3>Search cars</h3>
        <c:forEach var = "item" items = "${myCarsHolder}">
            ${item}
            <br>
        </c:forEach>
        <br>    
        <form action="searchForm.jsp" method="post">
            <input type="submit" value="Go Back to Seach">
        </form>
    </body>
</html>
