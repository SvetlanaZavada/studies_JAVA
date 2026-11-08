package lesson_2_5;

public class Main {
    public static int sumArray(String[][] array) {
        if (array == null || array.length != 4) {
            throw new MyArraySizeException("Ожидается массив 4x4");
        }
        for (int i = 0; i < 4; i++) {
            if (array[i] == null || array[i].length != 4) {
                throw new MyArraySizeException("Строка " + i + " неверной длины");
            }
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }
        return sum;
    }
    private static void test(String[][] array) {
        try {
            int result = sumArray(array);
            System.out.println("Сумма: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных: " + e.getMessage());
        }
    }
    public static void demoArrayIndexOutOfBounds() {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]);   // генерация: выход за границы
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String[][] nullArray = {
                {}
        };
        String[][] goodArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] badSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"}
        };

        String[][] badDataArray = {
                {"1", "2", "3", "4"},
                {"5", "99", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "1f", "16"}
        };
        test(nullArray);
        test(goodArray);
        test(badSizeArray);
        test(badDataArray);
        demoArrayIndexOutOfBounds();
    }
}
