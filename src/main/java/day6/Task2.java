package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing", 2019, 150, 20000);
        airplane.setYear(2018);
        airplane.setLength(160);
        airplane.fillUp(60);
        airplane.fillUp(250);
        System.out.println(airplane.info());
    }
}
