package Lesson_7_junit_5;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaTest {

    private final TriangleArea triangleArea = new TriangleArea();
    private static final double DELTA = 1e-9;

    @Test
    void areaOf345Triangle() {
        // классический прямоугольный треугольник: 3-4-5, площадь = 6
        assertEquals(6.0, triangleArea.calculate(3, 4, 5), DELTA);
    }

    @Test
    void areaOfEquilateralTriangle() {
        // сторона 2: площадь = sqrt(3) ≈ 1.7320508
        assertEquals(Math.sqrt(3), triangleArea.calculate(2, 2, 2), DELTA);
    }

    @ParameterizedTest
    @CsvSource({
            "3, 4, 5, 6.0",
            "6, 8, 10, 24.0",
            "5, 5, 6, 12.0"
    })
    void variousValidTriangles(double a, double b, double c, double expected) {
        assertEquals(expected, triangleArea.calculate(a, b, c), DELTA);
    }

    @Test
    void nonPositiveSideThrows() {
        assertThrows(IllegalArgumentException.class, () -> triangleArea.calculate(0, 3, 4));
        assertThrows(IllegalArgumentException.class, () -> triangleArea.calculate(3, -1, 4));
    }

    @Test
    void impossibleTriangleThrows() {
        // 1+2 < 10 — треугольник не существует
        assertThrows(IllegalArgumentException.class, () -> triangleArea.calculate(1, 2, 10));
        // вырожденный случай: 1+2 = 3
        assertThrows(IllegalArgumentException.class, () -> triangleArea.calculate(1, 2, 3));
    }
}
