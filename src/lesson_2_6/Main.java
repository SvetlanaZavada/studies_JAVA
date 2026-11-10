package lesson_2_6;

import java.util.Set;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        students.add(new Student("Анна",  "ИУ7-11", 1, 4.67));
        students.add(new Student("Иван",  "ИУ7-11", 1, 2.33));
        students.add(new Student("Мария", "ИУ7-12", 2, 3.67));
        students.add(new Student("Пётр",  "ИУ7-12", 2, 2.00));
        students.add(new Student("Ольга", "ИУ7-13", 3, 5.00));

        System.out.println("=== Исходный список ===");
        students.forEach(System.out::println);

        System.out.println();
        printStudents(students, 1);
        System.out.println();
        printStudents(students, 2);
        System.out.println();
        printStudents(students, 3);
        System.out.println();
        printStudents(students, 4);
        System.out.println();
        printStudents(students, 5);

        System.out.println();
        int removed = removeLowPerformers(students);
        System.out.println("Удалено студентов (ср. балл < 3): " + removed);

        int promoted = promoteToNextCourse(students);
        System.out.println("Переведено на следующий курс (ср. балл >= 3): " + promoted);

        System.out.println("\n=== После обработки ===");
        students.forEach(System.out::println);


    }

    static int removeLowPerformers(Set<Student> students) {
        int before = students.size();
        students.removeIf(s -> s.getAverageGrade() < 3.0);   // ← без изменений
        return before - students.size();
    }

    static int promoteToNextCourse(Set<Student> students) {
        int count = 0;
        for (Student s : students) {
            if (s.getAverageGrade() >= 3.0) {                // ← без изменений
                s.setCourse(s.getCourse() + 1);
                count++;
            }
        }
        return count;
    }
    static void printStudents(Set<Student> students, int course){
        System.out.println("Студенты " + course + " курса:");
        boolean found = false;
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println("  " + s.getName());
                found = true;
            }
        }
        if (!found) System.out.println("  (нет таких студентов)");
    }
}
