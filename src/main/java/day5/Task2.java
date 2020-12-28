package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Kavasaki", "red", 2020);
        System.out.println("Model: " + motorbike.getModel() + ", color: " + motorbike.getColor() + ", year of manufactured: " + motorbike.getYearOfManufactured());
    }

    public static class Motorbike {
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
    }

}
