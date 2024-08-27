<%-- 

    Document   : sidebar

    Created on : Jun 14, 2024, 1:15:09 PM

    Author     : THINH

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>



<%-----------------Css----------------%>

<link rel="stylesheet" href="<c:url value="/css/style.css"/>"></link>

    



<aside>

    <div class="d-flex">

        <nav class="bg-[#04605E] h-full sidebar">

            <ul class="list-unstyled">

                <li class="nav-item">

                    <a class="nav-link text-white ${page == 'index' ? 'isActive' : 'isNotActive'}" href="<c:url value="/" />">

                        <i class="fas fa-home"></i> Trang Chủ

                    </a>

                </li>

                <li class="nav-item">

                    <a class="nav-link text-white ${page == 'lockers' ? 'isActive' : 'isNotActive'}" href="<c:url value="/lockers/" />">

                        <i class="fas fa-box"></i> Quản Lý Tủ đồ

                    </a>

                </li>

                <li class="nav-item">

                    <a class="nav-link text-white ${page == 'reflectives' ? 'isActive' : 'isNotActive'}" href="<c:url value="/reflectives" />">

                        <i class="fas fa-file-alt"></i> Quản Lý Báo Cáo

                    </a>

                </li>

                <li class="nav-item">

                    <a class="nav-link text-white ${page == 'bills' ? 'isActive' : 'isNotActive'}" href="<c:url value="/invoices/" />">

                        <i class="fas fa-users"></i> Quản Lý Hóa Đơn

                    </a>

                </li>

                <li class="nav-item">

                    <a class="nav-link text-white ${page == 'surveys' ? 'isActive' : 'isNotActive'}" href="<c:url value="/surveys/" />">

                        <i class="fas fa-poll"></i> Khảo Sát

                    </a>

                </li>

                <li class="nav-item">

                    <a class="nav-link text-white ${page == 'relatives' ? 'isActive' : 'isNotActive'}" href="<c:url value="/relatives" />">

                        <i class="fas fa-box"></i> Quản Lý Họ Hàng

                    </a>

                </li>

                <li class="nav-item">

                    <a class="nav-link text-white ${page == 'statistics' ? 'isActive' : 'isNotActive'}" href="<c:url value="/statistics/" />">

                        <i class="fas fa-chart-bar"></i> Thống Kê

                    </a>

                </li>

            </ul>

        </nav>

    </div>

</aside>