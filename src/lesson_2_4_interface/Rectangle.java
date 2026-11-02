package lesson_2_4_interface;

public class Rectangle implements Shape {
    private final double a, b;
    private final String fillColor, borderColor;

    public Rectangle(double a, double b, String fillColor, String borderColor) {
        if (a <= 0 || b <= 0) throw new IllegalArgumentException("Стороны должны быть > 0");
        this.a = a;
        this.b = b;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getArea() { return a * b; }

    @Override
    public double[] getSides() { return new double[]{a, a, b, b}; }

    @Override
    public String getFillColor()   { return fillColor; }

    @Override
    public String getBorderColor() { return borderColor; }
}
