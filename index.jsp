<%-- 
    Document   : index
    Created on : 15-Aug-2023, 11:17:13 pm
    Author     : Admin
--%>

<%@page import="com.learn.mycart_511.helper.FactoryProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <h1>Creating session factory object</h1>
        
        <%
            out.println(FactoryProvider.getFactory()+"<br>");
            out.println(FactoryProvider.getFactory()+"<br>");
            out.println(FactoryProvider.getFactory()+"<br>");


        %>
        
    </body>
</html>
