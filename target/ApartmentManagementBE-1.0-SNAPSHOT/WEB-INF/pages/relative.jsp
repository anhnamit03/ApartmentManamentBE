<%-- 
    Document   : relative
    Created on : Jun 18, 2024, 5:30:43 PM
    Author     : THINH
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<h1 class="text-center text-dark mt-1">QUẢN LÝ HỌ HÀNG</h1>

<div class="d-flex justify-content mb-2">
    <form class="d-flex mx-2" action="<c:url value='/relative'/>">
        <input type="hidden" name="relationship" value=""/>
        <button class="btn btn-primary mt-2 mb-2" type="submit">All</button>
    </form>
    <form class="d-flex mx-2" action="<c:url value='/relative'/>">
        <input type="hidden" name="relationship" value="family"/>
        <button class="btn btn-success mt-2 mb-2" type="submit">Gia đình</button>
    </form>
    <form class="d-flex mx-2" action="<c:url value='/relative'/>">
        <input type="hidden" name="relationship" value="friend"/>
        <button class="btn btn-warning mt-2 mb-2" type="submit">Bạn bè</button>
    </form>
</div>

<table class="table">
    <tr>
        <th>#</th>
        <th>Tên họ hàng</th>
        <th>ID User quan hệ</th>
        <th>CCCD</th>
        <th>Điện thoại</th>
        <th>Mối quan hệ</th>
        <th></th>
    </tr>
    <c:forEach items="${relatives}" var="r">
        <tr>
            <td>${r[0]}</td>
            <td>${r[1]}</td>
            <td>${r[5].id}</td>
            <td>${r[2]}</td>
            <td>${r[3]}</td>
            <td>${r[4]}</td>
            <td>
                <a class="btn btn-primary" href="<c:url value='/relative/${r[0]}'/>">Chỉnh sửa</a>
                <c:url value='/api/relative/${r[0]}' var='deleteUrl'/>
                <button class="btn btn-danger" onclick="deleteRelative('${deleteUrl}')">Xóa</button>
            </td>
        </tr>
    </c:forEach>
</table>

