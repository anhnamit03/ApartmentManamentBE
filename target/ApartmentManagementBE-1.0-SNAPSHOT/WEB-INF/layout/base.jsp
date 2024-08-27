<%-- 
    Document   : base
    Created on : Jun 14, 2024, 1:14:56 PM
    Author     : THINH
--%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>   
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <%-----------------Bootstrap----------------%>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.bundle.min.js"></script>

    
     <%-----------------Css----------------%>
    <link rel="stylesheet" href="<c:url value="/css/style.css"/>"></link>
    
    <%-----------------Jquery----------------%>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    
    <%-----------------SweetAlert2----------------%>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    
    <%-----------------Tailwind css----------------%>
    <link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet" />
    <script src="https://cdn.tailwindcss.com"></script>
    
</head>
<body>
   <%--  Header      --%>
        <tiles:insertAttribute name="header" />
    <%--  Sidebar     --%>
    <div class="d-flex">
    <tiles:insertAttribute name="sidebar" />
    <div class="main-content">
        <div class="container mx-auto">
        <tiles:insertAttribute name="content" />
         
    </div>
    <script src="<c:url value="/js/index.js"/>"></script>
</body>
</html>
