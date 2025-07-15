# 📱 Ứng dụng Bán Hàng – Android

Ứng dụng bán hàng dành cho Android, hỗ trợ quản lý người dùng, sản phẩm, đơn hàng và tạo hóa đơn nhanh chóng, thân thiện với người dùng. Hoạt động hoàn toàn offline.

---

## 🚀 Tính năng chính

- ✅ Đăng nhập và phân quyền người dùng (Admin / Thu ngân)
- ✅ Quản lý người dùng: thêm, sửa, xóa
- ✅ Quản lý danh mục và sản phẩm
- ✅ Quét mã vạch trên mỗi sản phẩm để tạo đơn hàng
- ✅ Xem báo cáo doanh thu
- ✅ Lưu trữ dữ liệu cục bộ bằng Room
- ✅ Giao diện hiện đại, dễ sử dụng

## 📸 Hình ảnh minh họa

<div align="center"> <img  src="https://github.com/user-attachments/assets/565aad52-8a9e-4855-8172-4f1123f297ed" width="30%" />
 <img width="30%" src="https://github.com/user-attachments/assets/b4f6899c-67c6-4ccd-b5af-7717dba9a28d" />
<img src="https://github.com/user-attachments/assets/0dc6569e-b3d5-4fbe-ab28-dbe617928fc5" width="30%" /> <br><br> <img src="https://github.com/user-attachments/assets/a79d4eda-92b6-4c0a-8f21-4af125eeedea" width="30%" /> <img src="https://github.com/user-attachments/assets/eda10eef-42f5-460c-9db3-d9931d9c937a" width="30%" /> <img src="https://github.com/user-attachments/assets/79a90bc2-a4ab-404e-bb65-b9b020cae9ca" width="30%" /> <br><br> <img src="https://github.com/user-attachments/assets/9ece0a0f-fb26-4a8e-8a01-281ebf0b0286" width="30%" /> <img src="https://github.com/user-attachments/assets/cd3eac5d-17f3-4754-9e8a-76ff9d1b7f57" width="30%" /> </div>

---
## 🏗️ Kiến trúc phần mềm

Ứng dụng tuân theo mô hình **Clean Architecture**, kết hợp với kiến trúc **MVVM (Model - View - ViewModel)** giúp code rõ ràng, dễ bảo trì và mở rộng.

### 📁 Cấu trúc thư mục
```plaintext
presentation/
│
├── View (Fragment, Activity) #Giao diện
├── ViewModel #Xử lý tương tác UI
│
domain/
│
├── model/ # Định nghĩa các entity
├── repository/ (interface) #Interface kết nối với data layer
├── use_case/ #xử lý logic chính
│
data/
├── locale/ (Room DAO, Database)
├── repository/ (implementation)

📦 di/                   → Cấu hình Hilt DI
📦 utils/                → Hằng số và hàm tiện ích
📄 MyApplication.kt      → Application class

```
## 🧰 Công nghệ sử dụng

- 🏠 **Room** – Quản lý cơ sở dữ liệu cục bộ
- 💉 **Hilt** – Dependency Injection
- 🔁 **Kotlin Coroutines** – Xử lý bất đồng bộ
- 👓 **Jetpack ViewModel + LiveData** – Quản lý vòng đời và dữ liệu UI

---
## 📌 Ghi chú
Ứng dụng hoạt động hoàn toàn offline

Thiết kế tách biệt UI – Logic – Data

Sẵn sàng tích hợp API hoặc đồng bộ dữ liệu trong tương lai
