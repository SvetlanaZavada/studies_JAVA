package lesson_2_4_interface;

public class Triangle implements Shape {
    private final double a, b, c;
    private final String fillColor, borderColor;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        if (a <= 0 || b <= 0 || c <= 0) throw new IllegalArgumentException("Стороны > 0");
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double[] getSides() { return new double[]{a, b, c}; }

    @Override
    public String getFillColor()   { return fillColor; }

    @Override
    public String getBorderColor() { return borderColor; }
}