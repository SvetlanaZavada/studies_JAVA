package Lesson_7_junit_5;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvSource({
            "2, 3, 5",
            "0, 0, 0",
            "-5, 3, -2",
            "100, -100, 0"
    })
    void add(int a, int b, int expected) {
        assertEquals(expected, calculator.add(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "5, 3, 2",
            "3, 5, -2",
            "0, 0, 0"
    })
    void subtract(int a, int b, int expected) {
        assertEquals(expected, calculator.subtract(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "2, 3, 6",
            "0, 100, 0",
            "-2, 3, -6",
            "-2, -3, 6"
    })
    void multiply(int a, int b, int expected) {
        assertEquals(expected, calculator.multiply(a, b));
    }

    @Test
    void divide() {
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(0, calculator.divide(1, 2)); // целочисленное деление
    }

    @Test
    void divisionByZeroThrows() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
