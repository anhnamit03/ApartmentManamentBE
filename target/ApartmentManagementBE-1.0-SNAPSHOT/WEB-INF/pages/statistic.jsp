<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

<div class="container mx-auto mt-8">
    <h1 class="text-3xl font-bold mb-6 text-center">Thống kê doanh thu</h1>
    
    <form method="get" action="/ApartmentManagementBE/statistics/" class="mb-6 flex justify-center gap-4">
        <div class="flex items-center">
            <label for="year" class="mr-2">Chọn năm:</label>
            <input type="number" id="year" name="year" min="2000" max="2099" value="${param.year}"
                   class="px-4 py-2 border border-gray-300 rounded-md">
        </div>

        <div class="flex items-center">
            <label for="month" class="mr-2">Chọn tháng:</label>
            <input type="number" id="month" name="month" min="1" max="12" value="${param.month}"
                   class="px-4 py-2 border border-gray-300 rounded-md">
        </div>

        <button type="submit" class="px-4 py-2 bg-blue-500 text-white rounded-md hover:bg-blue-600 transition-colors duration-200">
            Thực hiện
        </button>
    </form>

 <div class="flex justify-center">
        <div class="w-full lg:w-1/2">
            <canvas id="myChart2" style="height: 500px; width: auto;"></canvas>
        </div>
    </div>
</div>

<script>
    function updateURL() {
        let year = document.getElementById('year').value;
        let month = document.getElementById('month').value;

        // Tạo URL với 2 path params
        let url = `/ApartmentManagementBE/statistics/?month=${month}&year=${year}`;

        // Chuyển hướng đến URL mới
        window.location.href = url;
    }

    let label2 = [];
    let data2 = [];
    <c:forEach items="${statistics}" var="s">
        label2.push("${s[0]}");
        data2.push(${s[1]});
    </c:forEach>

    function drawChart(ctx, labels, data) {
        new Chart(ctx, {
            type: 'bar',
            data: {
                labels: labels,
                datasets: [{
                    label: '# Doanh thu',
                    data: data,
                    borderWidth: 1,
                    backgroundColor: ['red', 'green', 'blue', 'gold', 'brown']
                }],
            },
            options: {
                scales: {
                    y: {
                        beginAtZero: true
                    }
                }
            }
        });
    }

    window.onload = function () {
        let ctx2 = document.getElementById("myChart2");
        drawChart(ctx2, label2, data2);
    }
</script>
