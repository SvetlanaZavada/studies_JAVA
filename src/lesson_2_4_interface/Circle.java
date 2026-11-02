package lesson_2_4_interface;

public class Circle implements Shape {
    private final double radius;
    private final String fillColor;
    private final String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        if (radius <= 0) throw new IllegalArgumentException("Радиус должен быть > 0");
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getArea() { return Math.PI * radius * radius; }

    @Override
    public double[] getSides() { return new double[]{ 2 * Math.PI * radius }; }

    @Override
    public String getFillColor()   { return fillColor; }

    @Override
    public String getBorderColor() { return borderColor; }
}
