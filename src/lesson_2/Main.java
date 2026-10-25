package lesson_2;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkSum(6, 15));
        checkNumber(39);
        System.out.println(isNumberNegative(-67));
        printTextMultipleTimes("Привет", 2);
        System.out.println(isLeapYear(1900));
        replaceArray();
        fillArray();
        doubleSmallNumbers();
        createDiagonalMatrix();
        createArray(3, 5);

    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = 3, b = -5;
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная ");
        }
    }

    public static void printColor(){
        int value = -300;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value >0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 56, b = 299;
        if (a >= b) {
            System.out.println("a >= b");

        }  else {
            System.out.println("a < b");
        }

    }

    public static boolean checkSum(int a, int b){
        int sum = a + b;
        return (sum >= 10 && sum <= 20);

    }

    public static void checkNumber(int a) {
      if (a >= 0) {
          System.out.println("Положительное число");
      } else {
          System.out.println("Отрицательное  число");
      }
    }

    public static boolean isNumberNegative(int a) {
        return (a < 0);
    }

    public static void printTextMultipleTimes(String text, int count){
        for (int i = 0; i < count; i++){
            System.out.println(text);
        }
    }

    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0)||(year % 400 == 0);
    }

    public static void replaceArray(){
        int [] array =  {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < array.length; i++){
            if (array[i] == 0) {
                array[i] = 1;
            } else {array[i] = 0;}
    }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static  void fillArray(){
        int[] array = new int[100];
        for (int i =0; i < array.length; i++){
            array [i] = i +1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static  void doubleSmallNumbers() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i =0; i< array.length; i++){
            if ( array [i] < 6){
                array [i] = array [i] *2;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static  void createDiagonalMatrix() {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
        }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
