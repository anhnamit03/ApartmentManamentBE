<%-- 
    Document   : header
    Created on : Jun 14, 2024, 1:15:03 PM
    Author     : THINH
--%>

<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!-- jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- Bootstrap JS -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.bundle.min.js"></script>

<nav class="navbar   navbar-dark bg-[#04605E]">
    <a class="navbar-brand" href="<c:url value="/" />">Quản Lý Hệ Thống</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
        <ul class="navbar-nav ml-auto">
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Tài khoản
                </a>
                <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="<c:url value="/profile"/>">Thông tin cá nhân</a>
                    <a class="dropdown-item" href="<c:url value="/logout"/>">Đăng xuất</a>
                </div>
            </li>
        </ul>
    </div>
</nav>

<script>
    $(document).ready(function() {
        // Prevent default behavior for dropdown toggles
        $('.dropdown-toggle').on('click', function(e) {
            var $el = $(this).next('.dropdown-menu');
            var isVisible = $el.is(':visible');
            $('.dropdown-menu').hide();
            if (!isVisible) {
                $el.show();
            }
            return false; // Prevent default action (e.g., following href)
        });

        // Close dropdowns when clicking outside
        $(document).on('click', function(e) {
            if (!$(e.target).closest('.dropdown').length) {
                $('.dropdown-menu').hide();
            }
        });
    });
</script>
