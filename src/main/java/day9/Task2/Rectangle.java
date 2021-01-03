package day9.Task2;

public class Rectangle extends Figure{

    private int weight;
    private int height;

    public Rectangle(int weight, int height, String color) {
        super(color);
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double area() {
        return weight * height;
    }

    @Override
    public double perimeter() {
        return (weight + height) * 2;
    }
}
