package Lesson_7_testng;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.expectThrows;

public class TriangleAreaTest {

    private final TriangleArea triangleArea = new TriangleArea();
    private static final double DELTA = 1e-9;

    @Test
    public void areaOf345Triangle() {
        assertEquals(triangleArea.calculate(3, 4, 5), 6.0, DELTA);
    }

    @Test
    public void areaOfEquilateralTriangle() {
        assertEquals(triangleArea.calculate(2, 2, 2), Math.sqrt(3), DELTA);
    }

    @DataProvider(name = "validTriangles")
    public Object[][] validTriangles() {
        return new Object[][]{
                {3.0, 4.0, 5.0, 6.0},
                {6.0, 8.0, 10.0, 24.0},
                {5.0, 5.0, 6.0, 12.0}
        };
    }

    @Test(dataProvider = "validTriangles")
    public void variousValidTriangles(double a, double b, double c, double expected) {
        assertEquals(triangleArea.calculate(a, b, c), expected, DELTA);
    }

    @Test
    public void nonPositiveSideThrows() {
        expectThrows(IllegalArgumentException.class, () -> triangleArea.calculate(0, 3, 4));
        expectThrows(IllegalArgumentException.class, () -> triangleArea.calculate(3, -1, 4));
    }

    @Test
    public void impossibleTriangleThrows() {
        expectThrows(IllegalArgumentException.class, () -> triangleArea.calculate(1, 2, 10));
        expectThrows(IllegalArgumentException.class, () -> triangleArea.calculate(1, 2, 3));
    }
}
