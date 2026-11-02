package lesson_2_4_interface;

public interface Shape {

    String getFillColor();
    String getBorderColor();

    double getArea();
    double[] getSides();

    default double getPerimeter() {
        double sum = 0;
        for (double side : getSides()) {
            sum += side;
        }
        return sum;
    }

    default void printInfo() {
        System.out.println(
                "Фигура: " + getClass().getSimpleName() + " Периметр: " + getPerimeter() +
                        " Площадь: " + getArea() +  " Фон: " + getFillColor() + " Граница: " +getBorderColor());
    }
}
