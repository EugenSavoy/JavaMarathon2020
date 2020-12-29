package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String lesson;

    public Teacher(String name, String lesson) {
        this.name = name;
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String evaluate(Student student) {
        Random random = new Random();
        int score = random.nextInt(6);
        String scoreS;
        switch (score){
            case 0:
            case 1:
            case 2:
                scoreS = "Неудовлетворительно";
                break;
            case 3:
                scoreS = "Удовлетворительно";
                break;
            case 4:
                scoreS = "Хорошо";
                break;
            case 5:
                scoreS = "Отлично";
                break;
            default:
                scoreS = "Непонятно";
        }


        return  String.format("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s.", this.name, student.getName(), this.lesson, scoreS);
    }

}
