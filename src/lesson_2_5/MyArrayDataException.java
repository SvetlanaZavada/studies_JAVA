package lesson_2_5;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int row, int col, String value) {
        super("Неверные данные в ячейке [" + row + "][" + col + "]: \"" + value + "\"");
    }
}