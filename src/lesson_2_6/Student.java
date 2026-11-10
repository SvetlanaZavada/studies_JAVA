package lesson_2_6;
import java.util.Objects;
import java.util.Set;

public class Student {
    private String name;
    private String group;
    private int course;
    private double averageGrade;

    public Student (String name, String group, int course, double averageGrade){
        this.name = name;
        this.group = group;
        this.course = course;
        this.averageGrade = averageGrade;
    }
    public String getName() { return name; }
    public String getGroup() { return group; }
    public int getCourse() { return course; }
    public double getAverageGrade() { return averageGrade; }

    public void setCourse(int course) { this.course = course; }

    @Override
    public String toString() {
        return "Student{name='" + name + "', group='" + group +
                "', course=" + course +
                ", avg=" + String.format("%.2f", averageGrade) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return Objects.equals(name, s.name) && Objects.equals(group, s.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group);
    }
}
