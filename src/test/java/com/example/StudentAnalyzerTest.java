package com.example; // Khai báo gói đúng theo cấu trúc thư mục: com/example

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*; // Import tĩnh cho các phương thức assert

// KHÔNG CẦN import com.example.StudentAnalyzer; vì cả hai lớp đều nằm trong cùng gói com.example

class StudentAnalyzerTest {

    @Test
    void testCalculateValidAverage() {
        StudentAnalyzer analyzer = new StudentAnalyzer(); // Không cần khai báo gói vì cùng gói
        List<Double> grades = Arrays.asList(8.0, 7.5, 9.0, 6.5);
        double expectedAverage = (8.0 + 7.5 + 9.0 + 6.5) / 4;
        assertEquals(expectedAverage, analyzer.calculateValidAverage(grades), 0.001, "Should calculate correct average for valid grades.");
    }

    @Test
    void testCalculateValidAverage_emptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> grades = Arrays.asList();
        // Kiểm tra xem phương thức có ném ra IllegalArgumentException không
        assertThrows(IllegalArgumentException.class, () -> analyzer.calculateValidAverage(grades), "Should throw IllegalArgumentException for empty list.");
    }

    @Test
    void testCalculateValidAverage_nullList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> grades = null;
        assertThrows(IllegalArgumentException.class, () -> analyzer.calculateValidAverage(grades), "Should throw IllegalArgumentException for null list.");
    }

    @Test
    void testCalculateValidAverage_invalidGrade() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> grades = Arrays.asList(8.0, 7.5, -1.0, 9.0); // Điểm không hợp lệ
        assertThrows(IllegalArgumentException.class, () -> analyzer.calculateValidAverage(grades), "Should throw IllegalArgumentException for invalid grade.");
    }

    @Test
    void testCountExcellentStudents() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> grades = Arrays.asList(8.0, 7.5, 9.0, 6.5, 9.5);
        double excellentThreshold = 8.5;
        assertEquals(2, analyzer.countExcellentStudents(grades, excellentThreshold), "Should count correct number of excellent students.");
    }

    @Test
    void testCountExcellentStudents_noExcellentStudents() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> grades = Arrays.asList(5.0, 6.0, 7.0);
        double excellentThreshold = 8.0;
        assertEquals(0, analyzer.countExcellentStudents(grades, excellentThreshold), "Should return 0 when no students are excellent.");
    }

    @Test
    void testCountExcellentStudents_emptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> grades = Arrays.asList();
        double excellentThreshold = 8.0;
        assertEquals(0, analyzer.countExcellentStudents(grades, excellentThreshold), "Should return 0 for an empty grades list.");
    }

    @Test
    void testCountExcellentStudents_nullList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> grades = null;
        double excellentThreshold = 8.0;
        assertEquals(0, analyzer.countExcellentStudents(grades, excellentThreshold), "Should return 0 for a null grades list.");
    }
}