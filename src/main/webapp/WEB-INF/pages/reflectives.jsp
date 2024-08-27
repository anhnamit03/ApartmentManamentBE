<%-- 
    Document   : feedbacks
    Created on : Jun 14, 2024, 1:52:40 PM
    Author     : THINH
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container mx-auto">
    <h1 class="text-center text-dark mt-1">Danh sách Phản hồi</h1>
    <table class="table table-bordered mt-3">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nội dung</th>
                <th>Người dùng</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="feedback" items="${feedbacks}">
                <tr>
                    <td>${feedback[0]}</td>
                    <td>${feedback[1]}</td>
                    <td>${feedback[2]}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>