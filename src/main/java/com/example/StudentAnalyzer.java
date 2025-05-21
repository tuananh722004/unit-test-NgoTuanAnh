package com.example; // Khai báo gói đúng theo cấu trúc thư mục: com/example

import java.util.List;

public class StudentAnalyzer {

    /**
     * Tính toán điểm trung bình hợp lệ từ một danh sách điểm.
     * Điểm phải nằm trong khoảng từ 0 đến 10.
     *
     * @param grades Danh sách điểm của sinh viên.
     * @return Điểm trung bình.
     * @throws IllegalArgumentException nếu danh sách điểm rỗng, null hoặc chứa điểm không hợp lệ.
     */
    public double calculateValidAverage(List<Double> grades) {
        if (grades == null || grades.isEmpty()) {
            throw new IllegalArgumentException("Grades list cannot be null or empty.");
        }
        double sum = 0;
        for (Double grade : grades) {
            // Kiểm tra từng điểm có hợp lệ không (0 <= điểm <= 10)
            if (grade == null || grade < 0 || grade > 10) {
                throw new IllegalArgumentException("Grade must be between 0 and 10.");
            }
            sum += grade;
        }
        return sum / grades.size();
    }

    /**
     * Đếm số lượng sinh viên đạt điểm xuất sắc dựa trên một ngưỡng nhất định.
     *
     * @param grades Danh sách điểm của sinh viên.
     * @param excellentThreshold Ngưỡng điểm để được coi là xuất sắc.
     * @return Số lượng sinh viên xuất sắc.
     */
    public int countExcellentStudents(List<Double> grades, double excellentThreshold) {
        if (grades == null) {
            return 0; // Trả về 0 nếu danh sách rỗng để tránh NullPointerException
        }
        int count = 0;
        for (Double grade : grades) {
            // Đảm bảo điểm không null trước khi so sánh
            if (grade != null && grade >= excellentThreshold) {
                count++;
            }
        }
        return count;
    }
}