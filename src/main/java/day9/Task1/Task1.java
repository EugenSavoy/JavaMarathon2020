package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("John", "406S");
        System.out.println(student.getGroup());
        student.printInfo();

        Teacher teacher = new Teacher("Michael", "History");
        System.out.println(teacher.getSubjectName());
        student.printInfo();

    }
}
