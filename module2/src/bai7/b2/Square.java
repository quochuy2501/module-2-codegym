package bai7.b2;

public class Square extends Shape implements Colorable{

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }
    @Override
    public String toString() {
        return "A square with side= " +
                getSide() +", which is a subclass of "+super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides...");
    }
}
