package Lesson_7_testng;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    @DataProvider(name = "addData")
    public Object[][] addData() {
        return new Object[][]{
                {2, 3, 5},
                {0, 0, 0},
                {-5, 3, -2},
                {100, -100, 0}
        };
    }

    @Test(dataProvider = "addData")
    public void add(int a, int b, int expected) {
        assertEquals(calculator.add(a, b), expected);
    }

    @DataProvider(name = "subtractData")
    public Object[][] subtractData() {
        return new Object[][]{
                {5, 3, 2},
                {3, 5, -2},
                {0, 0, 0}
        };
    }

    @Test(dataProvider = "subtractData")
    public void subtract(int a, int b, int expected) {
        assertEquals(calculator.subtract(a, b), expected);
    }

    @DataProvider(name = "multiplyData")
    public Object[][] multiplyData() {
        return new Object[][]{
                {2, 3, 6},
                {0, 100, 0},
                {-2, 3, -6},
                {-2, -3, 6}
        };
    }

    @Test(dataProvider = "multiplyData")
    public void multiply(int a, int b, int expected) {
        assertEquals(calculator.multiply(a, b), expected);
    }

    @Test
    public void divide() {
        assertEquals(calculator.divide(10, 5), 2);
        assertEquals(calculator.divide(1, 2), 0);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionByZeroThrows() {
        calculator.divide(10, 0);
    }
}
