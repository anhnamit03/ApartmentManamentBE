/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

const deleteButtons = document.querySelectorAll('.delete-btn');
deleteButtons.forEach(button => {
    button.addEventListener('click', function () {
        const deleteUrl = this.getAttribute('data-url');
        if (confirm('Bạn có chắc muốn xóa họ hàng này không?')) {
            deleteRelative(deleteUrl);
        }
    });
});

// Hàm gọi API xóa họ hàng
function deleteRelative(url) {
    fetch(url, {
        method: 'DELETE',
        headers: {
            'Content-Type': 'application/json'
                    // Các headers khác nếu cần
        },
    })
            .then(response => {
                if (!response.ok) {
                    throw new Error('Chịu');
                }
                // Xử lý thành công, có thể làm refresh trang hoặc cập nhật DOM
                alert('Xóa họ hàng thành công');
                window.location.reload(); // Refresh trang sau khi xóa thành công
            })
            .catch(error => {
                console.error('Lỗi:', error);
                alert('Xóa họ hàng không thành công');
            });
}

 $(document).ready(function() {
    var message = "${message}";
        if (message) {
            alert(message);
        }
});

