package Lesson_7_junit_5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    private final Factorial factorial = new Factorial();

    @Test
    void factorialOfZeroIsOne() {
        assertEquals(1L, factorial.calculate(0));
    }

    @Test
    void factorialOfOneIsOne() {
        assertEquals(1L, factorial.calculate(1));
    }

    @ParameterizedTest
    @CsvSource({
            "2, 2",
            "3, 6",
            "4, 24",
            "5, 120",
            "6, 720",
            "10, 3628800"
    })
    void factorialOfPositiveNumbers(int input, long expected) {
        assertEquals(expected, factorial.calculate(input));
    }

    @Test
    void negativeNumberThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> factorial.calculate(-1));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -5, -100})
    void anyNegativeNumberThrows(int input) {
        assertThrows(IllegalArgumentException.class, () -> factorial.calculate(input));
    }
}
