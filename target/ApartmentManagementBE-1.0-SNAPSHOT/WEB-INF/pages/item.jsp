<%-- 
    Document   : item
    Created on : Jun 14, 2024, 1:53:27 PM
    Author     : THINH
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container mx-auto">
    <h1 class="text-center mb-5">Các vật phẩm trong tủ đồ của cư dân: ${residentName}</h1>
    <div class="text-center mb-4">
        <a class="btn btn-success" href="<c:url value='/addItem'/>">
            <i class="fas fa-plus"></i> Thêm mới
        </a>
    </div>
    <div class="row">
<c:forEach items="${Item}" var="item">
            <div class="col-md-4">
                <div class="card mb-4">
                    <div class="card-body">
                        <h5 class="card-title">ID: ${item[0]}</h5>
                        <p class="card-text">Tên vật phẩm: ${item[1]}</p>
                        <p class="card-text">Trạng thái: 
                            <c:choose>
                                <c:when test="${item[6] == 0}">Chưa nhận</c:when>
                                <c:otherwise>Đã nhận</c:otherwise>
                            </c:choose>
                        </p>
                        <p class="card-text">Thời gian nhận: ${item[3]}</p>
                       <p class="card-text">Thời gian trả: 
                            <c:choose>
                                <c:when test="${item[6] == 0}">Chưa nhận</c:when>
                                    <c:otherwise>${item[4]}</c:otherwise>
                                </c:choose>
                        </p>
                       
                        <a class="btn btn-warning" href="<c:url value='/editItem/${item[0]}'/>">
                            <i class="fas fa-edit"></i> Sửa
                        </a>
                                <c:url value="/api/lockers/items/${item[0]}" var="urlDeleteItem"/>
                                <button type="submit" class="btn btn-danger" onclick="deleteItem('${urlDeleteItem}', ${item[0]})">Xóa</button>
                    </div>
                </div>
            </div>
</c:forEach>
    </div>
</div>
<script>
function deleteItem(url, id) {
    if (confirm("Bạn chắc chắn muốn deactivate người dùng này không?")) {
        fetch(url, {
            method: "DELETE" // Sử dụng method "DELETE" cho DeleteMapping
        }).then(res => {
            if (res.status === 204) {
                location.reload(); // reload trang khi thành công
            } else {
                alert("Không thể xóa item này. Vui lòng thử lại.");
            }
        }).catch(error => {
            console.error('Error:', error);
            alert("Đã xảy ra lỗi khi xóa item này.");
        });
    }
}
</script>
