package Day2.Inheritance.Abstraction;

public abstract class Shape {

    public String color;

    public Shape() {
    }

    // TODO: Add abstract method calculateArea
    //abstract method with no body
    public abstract double calculateArea(double length, double breadth, double radius);

    // TODO: Add abstract method calculatePerimeter
    public abstract double calculatePerimeter(double length, double breadth, double radius);

    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }
}
