package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("red");
        car.setModel("Rio");
        car.setYearOfManufactured(2019);

        System.out.println("Model: " + car.getModel() + ", color: " + car.getColor() + ", year of manufactured: " + car.getYearOfManufactured());
    }

    public static class Car {
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
    }
}
