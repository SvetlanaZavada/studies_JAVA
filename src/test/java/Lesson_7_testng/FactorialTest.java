package Lesson_7_testng;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FactorialTest {

    private final Factorial factorial = new Factorial();

    @Test
    public void factorialOfZeroIsOne() {
        assertEquals(factorial.calculate(0), 1L);
    }

    @Test
    public void factorialOfOneIsOne() {
        assertEquals(factorial.calculate(1), 1L);
    }

    @DataProvider(name = "positiveFactorials")
    public Object[][] positiveFactorials() {
        return new Object[][]{
                {2, 2L},
                {3, 6L},
                {4, 24L},
                {5, 120L},
                {6, 720L},
                {10, 3628800L}
        };
    }

    @Test(dataProvider = "positiveFactorials")
    public void factorialOfPositiveNumbers(int input, long expected) {
        assertEquals(factorial.calculate(input), expected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeNumberThrows() {
        factorial.calculate(-1);
    }

    @DataProvider(name = "negativeNumbers")
    public Object[][] negativeNumbers() {
        return new Object[][]{{-1}, {-5}, {-100}};
    }

    @Test(dataProvider = "negativeNumbers", expectedExceptions = IllegalArgumentException.class)
    public void anyNegativeNumberThrows(int input) {
        factorial.calculate(input);
    }
}
