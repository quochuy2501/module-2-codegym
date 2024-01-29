package bai5;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle();

        System.out.println("Radius: " + myCircle.getRadius());
        System.out.println("Area: " + myCircle.getArea());

        System.out.println("Radius: " + myCircle.radius);
        System.out.println("Color: " + myCircle.color);
    }
}
