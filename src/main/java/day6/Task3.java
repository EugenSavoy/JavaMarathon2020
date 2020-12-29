package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Иван");
        Teacher teacher = new Teacher("Alexey", "History");
        System.out.println(teacher.evaluate(student));
    }
}
