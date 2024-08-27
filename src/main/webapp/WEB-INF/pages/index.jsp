<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>

<div class="container mx-auto">
    <h1 class="text-center text-dark mt-1">Quản lý Cư dân</h1>
    <div class="d-flex justify-content mb-2">
<c:url value="/resident" var="resident"/>
        <a class="btn btn-primary mt-2 mb-2 mx-2" href="${resident}">Thêm cư dân</a>
    </div>
    <ul class="pagination mt-1">
<c:forEach begin="1" end="${counter}" var="i">
    <c:url value="/" var="pageAction">
        <c:param name="page" value="${i}" />
    </c:url>
            <li class="page-item"><a class="page-link" href="${pageAction}">${i}</a></li>
</c:forEach>
    </ul>
    <div class="row">
<c:forEach var="user" items="${users}">
    <c:if test="${user.status == 1}">
                <div class="col-md-4 mb-4">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">${user.fullname}</h5>
                            <img src="${user.linkImage}" alt="alt" width="70%"/>
                            <p class="card-text">ID: ${user.id}</p>
                            <p class="card-text">Phone: ${user.phone}</p>
                            <p class="card-text">Giới tính: ${user.gender == 0 ? 'Nam' : 'Nữ'}</p>
                            <p class="card-text">Active: ${user.active == 1 ? 'Yes' : 'No'}</p>
                            <div class="action-buttons">
                                <c:url value="/residentUpdate/${user.id}" var="residentUpdateUrl"/>
                                     <a href="${residentUpdateUrl}" class="btn btn-primary mr-2">Chỉnh sửa</a>
                                <c:url value="/api/users/deactivate/${user.id}" var="urlDeactivate"/>
                                <button type="submit" class="btn btn-danger" onclick="deactivateUser('${urlDeactivate}', ${user.id})">Deactivate</button>
                            </div>
                        </div>
                    </div>
                </div>
    </c:if>
</c:forEach>
    </div>
</div>

<script>
function deactivateUser(url, userId) {
    if (confirm("Bạn chắc chắn muốn deactivate người dùng này không?")) {
        fetch(url, {
            method: "put" // sử dụng method "put" cho PutMapping
        }).then(res => {
            if (res.status === 204) {
                location.reload(); // reload trang khi thành công
            } else {
                alert("Không thể deactivate người dùng. Vui lòng thử lại.");
            }
        }).catch(error => {
            console.error('Error:', error);
            alert("Đã xảy ra lỗi khi deactivate người dùng.");
        });
    }
}
</script>

