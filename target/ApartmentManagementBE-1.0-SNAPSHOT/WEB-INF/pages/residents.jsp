<%-- 
    Document   : resident
    Created on : Jun 17, 2024, 11:00:49 PM
    Author     : THINH
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>

<c:url value="/resident" var="action" />
<c:if test="${errMsg != null}">
    <div class="alert alert-danger">${errMsg}</div>
</c:if>
<div class="container mx-auto">
    <h1 class="text-center text-dark mt-1">Thêm Cư dân</h1>
    <form:form method="post" action="${action}" modelAttribute="users" class="mt-3 bg-white p-8 rounded-lg shadow-md w-full max-w-lg mx-auto">
         <form:errors path="*" element="div" cssClass="alert alert-danger" />
        <div class="form-group mb-4">
            <label for="username" class="block text-gray-600">Username:</label>
            <form:input path="username" class="form-control w-full border border-gray-300 rounded py-2" id="username" />
        </div>
        <div class="form-group mb-4">
            <label for="password" class="block text-gray-600">Password:</label>
            <form:input path="password" class="form-control w-full border border-gray-300 rounded py-2" id="password" type="password" />
        </div>
        <div class="form-group mb-4">
            <label for="fullname" class="block text-gray-600">Full Name:</label>
            <form:input path="fullname" class="form-control w-full border border-gray-300 rounded py-2" id="fullname" />
        </div>
        <div class="form-group mb-4">
            <label for="phone" class="block text-gray-600">Phone:</label>
            <form:input path="phone" class="form-control w-full border border-gray-300 rounded py-2" id="phone" />
        </div>
        <div class="form-group mb-4">
            <label for="gender" class="block text-gray-600">Gender:</label>
            <form:select path="gender" class="form-control w-full border border-gray-300 rounded py-2" id="gender">
                <form:option value="0">Nam</form:option>
                <form:option value="1">Nữ</form:option>
            </form:select>
        </div>
        
        <button type="submit" class="btn btn-primary mt-3 w-full bg-blue-600 hover:bg-blue-700 text-white py-2 rounded">Thêm Cư dân</button>
    </form:form>
</div>
