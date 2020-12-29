package day6;

public class Car {
    private String model; // по идее нужен еще класс модели, но в данной постановке использую строку
    private String color;
    private int yearOfManufactured;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfManufactured() {
        return yearOfManufactured;
    }

    public void setYearOfManufactured(int yearOfManufactured) {
        this.yearOfManufactured = yearOfManufactured;
    }

    public String info() {
        return "Это автомобиль";
    }

    public int yearDifference(int inputYear) {
        int result = this.yearOfManufactured - inputYear;
        if (result > 0) {
            return result;
        } else {
            return 1;
        }
    }

}
