<%-- 
    Document   : surveys
    Created on : Jun 14, 2024, 1:52:49 PM
    Author     : THINH
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container mx-auto">
    <h1 class="text-center text-dark mt-1">Danh sách Khảo sát</h1>

    <c:if test="${not empty surveys}">
        <table class="table table-bordered mt-3">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Ngày khởi tạo</th>
                    <th>Mô tả</th>
                    <th>Người Tham Gia Khảo Sát</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="survey" items="${surveys}">
                    <tr>
                        <td>${survey[0]}</td>
                        <td>${survey[1]}</td>
                        <td>${survey[2]}</td>
                        <td>${survey[3].fullname}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>

    <div class="text-center mt-4">
        <a href="<c:url value='/surveys/survey_create'/>" class="btn btn-primary">Thêm Khảo sát Mới</a>
    </div>
</div>

