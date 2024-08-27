<%-- 
    Document   : locker
    Created on : Jun 14, 2024, 1:52:57 PM
    Author     : THINH
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container mx-auto">
    <h1 class="text-center mb-5">QUẢN LÝ TỦ ĐỒ CỦA CƯ DÂN</h1>
    <div class="row">
        <c:forEach items="${lockers}" var="locker">
            <div class="col-md-4">
                <div class="card mb-4">
                    <div class="card-body">
                        <h5 class="card-title">ID: ${locker[0]}</h5>
                        <p class="card-text">Tên cư dân: ${locker[2]}</p>
                        <a class="btn btn-primary" href="<c:url value='/lockers/items/${locker[0]}'/>">Chi tiết</a>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>


