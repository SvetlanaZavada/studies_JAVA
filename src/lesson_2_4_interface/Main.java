package lesson_2_4_interface;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(4, "Red", "Black"),
                new Rectangle(4, 6, "Blue", "Green"),
                new Triangle(3, 4, 5, "Yellow", "Purple")
        );

        for (Shape s : shapes) {
            s.printInfo();
        }
    }
}
