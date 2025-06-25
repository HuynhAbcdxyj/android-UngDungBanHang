# 📱 POS Terminal App

Ứng dụng bán hàng (Point-of-Sale) cho Android giúp quản lý người dùng, sản phẩm, đơn hàng và tạo hóa đơn dễ dàng.

## 🚀 Tính năng chính

- Đăng nhập và phân quyền (Admin / Cashier)
- Quản lý người dùng (thêm / sửa / xóa)
- Quản lý danh mục, sản phẩm
- Tạo và xem đơn hàng , báo cáo bán hàng
- Lưu trữ dữ liệu cục bộ bằng Room Database
- Giao diện hiện đại, dễ sử dụng

## 🏗️ Kiến trúc phần mềm
Ứng dụng được phát triển theo mô hình **Clean Architecture** kết hợp **MVVM (Model - View - ViewModel)**, giúp dễ bảo trì, kiểm thử và mở rộng.
presentation/
│
├── View (Fragment, Activity) #Giao diện
├── ViewModel #Xử lý tương tác UI
│
domain/
│
├── model/ #Định nghĩa các entity 
├── repository/ (interface) #Interface kết nối với datalayer
├── use_case/ #xử lý logic chính 
│
data/
├── locale/ (Room DAO, Database)
├── repository/ (implementation)

📦 di/ → Dependency Injection (Hilt)
📦 utils/ → Hằng số, tiện ích dùng chung
📄 MyApplication.kt → Lớp khởi tạo ứng dụng

## 🧰 Công nghệ sử dụng

- 🏠 **Room** – Quản lý database cục bộ
- 💉 **Hilt** – Dependency Injection hiện đại
- 🔁 **Kotlin Coroutines** – Xử lý bất đồng bộ
- 👓 **LiveData + ViewModel** – Jetpack Architecture Components

## 📌 Ghi chú

- Ứng dụng **hoạt động offline** hoàn toàn nhờ lưu trữ nội bộ
- Thiết kế **tách biệt rõ ràng** giữa logic và giao diện
- Dễ dàng tích hợp backend hoặc API trong tương lai

