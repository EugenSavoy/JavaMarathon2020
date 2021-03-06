package day9.Task2;

public class Circle extends Figure {

    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }

    @Override
    public double perimeter() {
        double result = (2 * Math.PI) * radius;
        return result;
    }
}
