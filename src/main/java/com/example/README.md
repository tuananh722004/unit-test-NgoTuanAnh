# Bài tập thực hành kiểm thử với JUnit: Phân tích dữ liệu điểm số học sinh

Đây là project thực hành kiểm thử đơn vị (Unit Testing) với JUnit 5 cho một ứng dụng phân tích điểm số học sinh.

## Mô tả Bài toán

Project này triển khai lớp `StudentAnalyzer` với các phương thức giúp phân tích và xử lý dữ liệu điểm số học sinh:

### 1. `countExcellentStudents(List<Double> scores)`
* **Chức năng:** Phân tích danh sách điểm số và trả về số lượng học sinh đạt loại Giỏi.
* **Tiêu chí Giỏi:** Điểm số từ 8.0 trở lên.
* **Xử lý dữ liệu sai:** Bỏ qua các điểm số nhỏ hơn 0 hoặc lớn hơn 10 (coi là dữ liệu không hợp lệ).
* **Trường hợp danh sách rỗng:** Nếu danh sách điểm rỗng hoặc `null`, phương thức sẽ trả về 0.

### 2. `calculateValidAverage(List<Double> scores)`
* **Chức năng:** Tính điểm trung bình của các điểm hợp lệ trong danh sách.
* **Điểm hợp lệ:** Điểm số phải nằm trong khoảng từ 0 đến 10 (bao gồm cả 0 và 10).
* **Xử lý dữ liệu sai:** Các điểm nhỏ hơn 0 hoặc lớn hơn 10 sẽ bị bỏ qua và không được tính vào điểm trung bình.
* **Trường hợp danh sách rỗng:** Nếu danh sách điểm rỗng hoặc không có điểm hợp lệ nào, phương thức sẽ ném ra `IllegalArgumentException`.

## Yêu cầu kỹ thuật đã triển khai

* **Điều kiện 1:** Xử lý bỏ qua điểm nhỏ hơn 0 hoặc lớn hơn 10.
* **Điều kiện 2:** Xử lý danh sách rỗng (trả về 0 cho `countExcellentStudents`, ném exception cho `calculateValidAverage`).
* **Vòng lặp 1:** Duyệt qua danh sách điểm để lọc học sinh giỏi.
* **Vòng lặp 2:** Duyệt qua danh sách để tính trung bình các điểm hợp lệ.

## Hướng dẫn chạy chương trình và kiểm thử

Dự án này được xây dựng với Apache Maven.

### Yêu cầu:
* Java Development Kit (JDK) 11 trở lên.
* Apache Maven 3.6.0 trở lên.

### Các bước thực hiện:

1.  **Clone Repository:**
    ```bash
    git clone [https://github.com/tuananh722004/unit-test-NgoTuanAnh.git](https://github.com/tuananh722004/unit-test-NgoTuanAnh.git)
    ```

2.  **Điều hướng vào thư mục dự án:**
    ```bash
    cd unit-test-NgoTuanAnh
    ```

3.  **Biên dịch và chạy kiểm thử:**
    Để biên dịch mã nguồn, chạy tất cả các bài kiểm thử, và đóng gói dự án thành file `.jar` (và cài đặt vào kho lưu trữ Maven cục bộ của bạn):
    ```bash
    mvn clean install
    ```
    Để chỉ chạy các bài kiểm thử mà không cần biên dịch lại nếu không có thay đổi mã nguồn:
    ```bash
    mvn test
    ```

### Kết quả kiểm thử dự kiến:
Bạn sẽ thấy thông báo `BUILD SUCCESS` và `Tests run: X, Failures: 0, Errors: 0, Skipped: 0` (trong đó `X` là tổng số bài kiểm thử đã chạy).

## Liên kết với Issues trên GitHub

Mỗi thay đổi và phát triển trong dự án này đều được liên kết với các Issue cụ thể trên GitHub để theo dõi tiến độ và yêu cầu:
* `#1`: Viết hàm countExcellentStudents()
* `#2`: Viết hàm calculateValidAverage()
* `#3`: Viết test cho 2 hàm trên
* `#4`: Viết tài liệu README.md

---
*Ngo Tuan Anh - [Ngày cập nhật gần nhất: 21/05/2025]*