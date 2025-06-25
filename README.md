# 📱 Ứng dụng bán hàng

Ứng dụng bán hàng (Point-of-Sale) cho Android giúp quản lý người dùng, sản phẩm, đơn hàng và tạo hóa đơn nhanh chóng và dễ dàng.

---

## 🚀 Tính năng chính

- Đăng nhập và phân quyền (Admin / Cashier)
- Quản lý người dùng: thêm, sửa, xóa
- Quản lý danh mục, sản phẩm
- Tạo đơn hàng và xem báo cáo doanh thu
- Lưu trữ dữ liệu cục bộ bằng Room Database
- Giao diện thân thiện, hiện đại, dễ sử dụng

🧰 Công nghệ sử dụng
🏠 Room – Quản lý dữ liệu cục bộ

💉 Hilt – Dependency Injection (DI)

🔁 Kotlin Coroutines – Xử lý bất đồng bộ

👓 Jetpack ViewModel + LiveData – Quản lý vòng đời & dữ liệu UI

📌 Ghi chú
Ứng dụng hoạt động hoàn toàn offline, không cần kết nối mạng

Thiết kế tách biệt rõ ràng giữa các tầng UI – Logic – Data

Dễ dàng mở rộng và tích hợp API trong tương lai

## 🏗️ Kiến trúc phần mềm

Ứng dụng áp dụng mô hình **Clean Architecture** kết hợp với kiến trúc **MVVM (Model - View - ViewModel)**, giúp code dễ bảo trì, test và mở rộng.

<details>
<summary><b>📁 Cấu trúc thư mục</b></summary>

```plaintext
📦 presentation/
 ┣ 📂 views              → Giao diện: Fragment, Activity
 ┗ 📂 viewmodel          → ViewModel xử lý logic giao diện

📦 domain/
 ┣ 📂 model              → Định nghĩa các entity (MainUser, Product, Order,...)
 ┣ 📂 repository         → Interface kết nối giữa tầng domain và data
 ┗ 📂 use_case           → Xử lý logic nghiệp vụ (đăng nhập, lưu dữ liệu,...)

📦 data/
 ┣ 📂 locale             → Room DAO, Database (dữ liệu cục bộ)
 ┗ 📂 repository         → Triển khai các interface từ domain

📦 di/                   → Cấu hình Dependency Injection (Hilt)
📦 utils/                → Các hằng số, hàm tiện ích dùng chung
📄 MyApplication.kt      → Lớp khởi tạo ứng dụng (Application class)

