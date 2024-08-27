<%-- 
    Document   : item-create
    Created on : Jun 17, 2024, 3:35:35 PM
    Author     : THINH
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<div class="container mx-auto">
    <h1 class="text-center mb-5">Thêm vật phẩm vào tủ đồ của cư dân</h1>
    <c:url value="/addItem" var="action" />
    <form:form method="post" action="${action}" modelAttribute="item" class="bg-white p-8 rounded-lg shadow-md w-full max-w-lg mx-auto">
        <form:hidden id="id" path="id" />
        <form:hidden id="id_locker" path="id_locker" />

        <div class="form-floating mb-3">
            <form:input class="form-control" id="name" placeholder="Tên" path="name" />
            <label for="name">Tên</label>
        </div>

        <div class="form-floating mb-3">
            <form:input class="form-control" id="description" placeholder="Mô tả" path="description" />
            <label for="description">Mô tả</label>
        </div>

        <div class="form-floating mb-3">
            <form:select class="form-control" id="id_status" path="id_status">
                <form:option value="0">Chưa nhận</form:option>
                <form:option value="1">Đã nhận</form:option>
            </form:select>
            <label for="id_status">Trạng thái</label>
        </div>

        <div class="form-floating mb-3">
            <form:input type="datetime-local" class="form-control" id="received_time" placeholder="Thời gian nhận" path="received_time" />
            <label for="received_time">Thời gian nhận</label>
        </div>

        <div class="form-floating mb-3">
            <form:input type="datetime-local" class="form-control" id="returned_time" placeholder="Thời gian trả" path="returned_time" />
            <label for="returned_time">Thời gian trả</label>
        </div>

        <div class="form-floating mb-3">
            <button class="btn btn-primary mt-1" type="submit">Lưu</button>
        </div>
    </form:form>
</div>