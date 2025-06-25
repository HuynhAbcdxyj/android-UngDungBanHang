# 📱 Ứng dụng Bán Hàng – Android

Ứng dụng bán hàng dành cho Android, hỗ trợ quản lý người dùng, sản phẩm, đơn hàng và tạo hóa đơn nhanh chóng, thân thiện với người dùng. Hoạt động hoàn toàn offline.

---

## 🚀 Tính năng chính

- ✅ Đăng nhập và phân quyền người dùng (Admin / Thu ngân)
- ✅ Quản lý người dùng: thêm, sửa, xóa
- ✅ Quản lý danh mục và sản phẩm
- ✅ Tạo đơn hàng, lập hóa đơn
- ✅ Xem báo cáo doanh thu
- ✅ Lưu trữ dữ liệu cục bộ bằng Room
- ✅ Giao diện hiện đại, dễ sử dụng

---

## 🧰 Công nghệ sử dụng

- 🏠 **Room** – Quản lý cơ sở dữ liệu cục bộ
- 💉 **Hilt** – Dependency Injection
- 🔁 **Kotlin Coroutines** – Xử lý bất đồng bộ
- 👓 **Jetpack ViewModel + LiveData** – Quản lý vòng đời và dữ liệu UI

---

## 🏗️ Kiến trúc phần mềm

Ứng dụng tuân theo mô hình **Clean Architecture**, kết hợp với kiến trúc **MVVM (Model - View - ViewModel)** giúp code rõ ràng, dễ bảo trì và mở rộng.

### 📁 Cấu trúc thư mục

<details>
<summary><b>Hiển thị chi tiết</b></summary>

```plaintext
📦 presentation/
 ┣ 📂 views              → Giao diện: Fragment, Activity
 ┗ 📂 viewmodel          → ViewModel xử lý logic giao diện

📦 domain/
 ┣ 📂 model              → Entity (MainUser, Product, Order,...)
 ┣ 📂 repository         → Interface giữa domain và data
 ┗ 📂 use_case           → Logic nghiệp vụ (đăng nhập, tạo hóa đơn,...)

📦 data/
 ┣ 📂 locale             → Room DAO và Database
 ┗ 📂 repository         → Triển khai repository interface

📦 di/                   → Cấu hình Hilt DI
📦 utils/                → Hằng số và hàm tiện ích
📄 MyApplication.kt      → Application class

