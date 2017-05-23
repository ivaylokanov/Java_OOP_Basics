package pr01_shapes;

public abstract class Shape {
    private double perimeter;
    private double area;

    public Shape() {
    }

    public abstract void calculatePerimeter();

    public abstract void calculateArea();
}
