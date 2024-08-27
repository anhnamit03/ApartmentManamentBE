<%-- 
    Document   : login.jsp
    Created on : Jun 14, 2024, 1:40:54 PM
    Author     : THINH
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <%-----------------Tailwind css----------------%>
    <link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet" />
    <script src="https://cdn.tailwindcss.com"></script>

</head>
<body class="bg-gradient-to-r from-blue-400 to-purple-500 flex items-center justify-center h-screen m-0">
    <c:url value="/login" var="action"/>
    <form method="post" action="${action}" class="login-form bg-white p-8 rounded-lg shadow-md w-full max-w-md">
        <h2 class="text-2xl font-bold mb-6 text-center text-gray-700">Login</h2>
        <div class="mb-4 relative">
            <label for="username" class="block text-gray-600">
                <i class="fa fa-user absolute left-3 top-1/2 transform -translate-y-1/2"></i>
                Username
            </label>
            <input type="text" class="form-control pl-10 w-full border border-gray-300 rounded py-2" id="username" placeholder="Tên đăng nhập" name="username" required>
        </div>
        <div class="mb-4 relative">
            <label for="password" class="block text-gray-600">
                <i class="fa fa-lock absolute left-3 top-1/2 transform -translate-y-1/2"></i>
                Password
            </label>
            <input type="password" class="form-control pl-10 w-full border border-gray-300 rounded py-2" id="password" placeholder="Mật khẩu" name="password" required>
        </div>
        <button type="submit" class="btn btn-primary w-full bg-blue-600 hover:bg-blue-700 text-white py-2 rounded">Login</button>
    </form>
</body>
</html>
