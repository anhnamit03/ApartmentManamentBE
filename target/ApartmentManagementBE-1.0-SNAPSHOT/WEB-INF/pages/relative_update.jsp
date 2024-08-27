<%-- 
    Document   : relative_update
    Created on : Jun 18, 2024, 5:31:54 PM
    Author     : THINH
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container mx-auto">
    <h1 class="text-center text-dark mt-1">Chỉnh sửa Họ Hàng</h1>
    <form action="<c:url value='/relative/${relative.id}'/>" method="post" class="bg-white p-8 rounded-lg shadow-md w-full max-w-lg mx-auto">
        <table class="table w-full">
            <tr>
                <td class="p-2">Tên họ hàng:</td>
                <td class="p-2"><input type="text" name="nameRelative" value="${relative.nameRelative}" class="form-control w-full border border-gray-300 rounded py-2" /></td>
            </tr>
            <tr>
                <td class="p-2">CCCD:</td>
                <td class="p-2"><input type="text" name="cccd" value="${relative.cccd}" class="form-control w-full border border-gray-300 rounded py-2" /></td>
            </tr>
            <tr>
                <td class="p-2">Điện thoại:</td>
                <td class="p-2"><input type="text" name="phone" value="${relative.phone}" class="form-control w-full border border-gray-300 rounded py-2" /></td>
            </tr>
            <tr>
                <td class="p-2">Mối quan hệ:</td>
                <td class="p-2"><input type="text" name="relationship" value="${relative.relationship}" class="form-control w-full border border-gray-300 rounded py-2" /></td>
            </tr>
            <tr>
                <td colspan="2" class="text-center p-2">
                    <button type="submit" class="btn btn-primary mr-2">Lưu</button>
                    <a href="<c:url value='/relative'/>" class="btn btn-secondary">Hủy</a>
                </td>
            </tr>
        </table>
    </form>
</div>
