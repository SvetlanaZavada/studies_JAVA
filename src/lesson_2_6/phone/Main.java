package lesson_2_6.phone;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();

        book.add("Иванов", "111-11-11");
        book.add("Петров", "222-22-22");
        book.add("Иванов", "333-33-33");
        book.add("Сидоров", "444-44-44");

        printPhones(book, "Иванов");
        printPhones(book, "Петров");
        printPhones(book, "Смирнов");
    }

    private static void printPhones(PhoneBook book, String name) {
        List<String> phones = book.get(name);
        System.out.println("Фамилия: " + name + " -> " + phones);
    }
}
