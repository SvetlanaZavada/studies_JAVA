package Lesson_7_junit_5;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CompareNumbersTest {

    private final CompareNumbers comparator = new CompareNumbers();

    @ParameterizedTest
    @CsvSource({
            "5, 3, a больше b",
            "3, 5, a меньше b",
            "5, 5, a равно b",
            "-1, -5, a больше b",
            "-5, -1, a меньше b",
            "0, 0, a равно b"
    })
    void compare(int a, int b, String expected) {
        assertEquals(expected, comparator.compare(a, b));
    }
}
