<%-- 
    Document   : survey_create
    Created on : Jun 25, 2024, 8:15:46 PM
    Author     : THINH
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container mx-auto">
    <h2 class="text-center text-dark mt-5">Thêm Khảo sát Mới</h2>

    <c:url value="/surveys/survey_create" var="action" />
    <form:form method="post" action="${action}" modelAttribute="surveyform">
         <form:errors path="*" element="div" cssClass="alert alert-danger" />
        <div class="form-floating mb-3 mt-3">
            <label for="description">Mô tả</label>
            <form:input class="form-control" id="description" placeholder="Mô tả" path="description" />
        </div>

        <div class="form-floating mb-3 mt-3">
            <form:select class="form-control" id="id_user" path="id_user">
                <form:option value="" label="Chọn người dùng"/>
                <c:forEach var="user" items="${users}">
                    <form:option value="${user.id}" label="${user.username}"/>
                </c:forEach>
            </form:select>
            <label for="id_user">Cư dân</label>
        </div>

        <div class="form-floating mb-3 mt-3">
            <button class="btn btn-primary mt-1" type="submit">Thêm Khảo sát</button>
        </div>
    </form:form>
</div>