<%-- 
    Document   : invoice
    Created on : Jun 14, 2024, 1:53:55 PM
    Author     : THINH
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<div class="container mx-auto">
    <h1 class="text-center mb-4">Quản Lý Hóa Đơn</h1>
    <div class="filter-bar mb-4">
        <form method="get" action="<c:url value='/invoices/'/>" class="flex space-x-2">
            <select name="month" class="form-control">
                <option value="">Chọn tháng</option>
                <c:forEach var="i" begin="1" end="12">
                    <option value="${i}">${i}</option>
                </c:forEach>
            </select>
            <select name="year" class="form-control">
                <option value="">Chọn năm</option>
                <c:forEach var="y" begin="2020" end="2025">
                    <option value="${y}">${y}</option>
                </c:forEach>
            </select>
            <button type="submit" class="btn btn-primary">Lọc</button>
        </form>
    </div>
            
    <c:url var='invoiceUrl' value='/'>
        <c:param name="month" value="${inMonth}"></c:param>
        <c:param name="year" value="${inYear}"></c:param>
    </c:url>
           

    <div class="row">
        <c:forEach items="${invoices}" var="p">
            <div class="col-md-12 mb-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">ID: ${p[0]}</h5>
                        <p class="card-text"><strong>Trạng thái: </strong>
                            <c:choose>
                                <c:when test="${p[1] == 0}">
                                    <span class="text-danger">Chưa đóng phí</span>
                                </c:when>
                                <c:otherwise>
                                    <span class="text-success">Đã đóng phí</span>
                                </c:otherwise>
                            </c:choose>
                        </p>
                        <p class="card-text"><strong>Mô tả: </strong>${p[2]}</p>
                        <p class="card-text"><strong>Ngày thu: </strong>
                            <c:choose>
                                <c:when test="${p[1] == 0}">
                                    <span class="text-danger">Chưa đóng phí</span>
                                </c:when>
                                <c:otherwise>
                                    <fmt:formatDate value="${p[3]}" pattern="dd/MM/yyyy HH:mm:ss"/>
                                </c:otherwise>
                            </c:choose>
                        </p>
                        <p class="card-text"><strong>Tên Cư Dân: </strong>${p[6]}</p>
                        <p class="card-text"><strong>Loại Phí: </strong>${p[4]}</p>
                        <p class="card-text"><strong>Giá: </strong><fmt:formatNumber value="${p[5]}" type="currency" currencySymbol="₫"/></p>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

