package day6;

public class Motorbike {
    private String model;
    private String color;
    private int yearOfManufactured;

    public Motorbike(String model, String color, int yearOfManufactured) {
        this.model = model;
        this.color = color;
        this.yearOfManufactured = yearOfManufactured;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfManufactured() {
        return yearOfManufactured;
    }

    public String info(){
        return "Это мотоцикл";
    }
}
