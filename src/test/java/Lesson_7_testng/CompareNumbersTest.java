package Lesson_7_testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CompareNumbersTest {

    private final CompareNumbers comparator = new CompareNumbers();

    @DataProvider(name = "compareData")
    public Object[][] compareData() {
        return new Object[][]{
                {5, 3, "a больше b"},
                {3, 5, "a меньше b"},
                {5, 5, "a равно b"},
                {-1, -5, "a больше b"},
                {-5, -1, "a меньше b"},
                {0, 0, "a равно b"}
        };
    }

    @Test(dataProvider = "compareData")
    public void compare(int a, int b, String expected) {
        assertEquals(comparator.compare(a, b), expected);
    }
}

