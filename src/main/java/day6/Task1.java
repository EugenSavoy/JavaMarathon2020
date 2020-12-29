package day6;

public class Task1 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Honda", "red", 2007);
        System.out.println(motorbike.info());
        System.out.println(motorbike.getYearOfManufactured());
    }
}
