package bai6.MoveablePoint;

public class Main {
    public static void main(String[] args) {
        MoveablePoint p1=new MoveablePoint();
        MoveablePoint p2=new MoveablePoint(2,3,4,5);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p2.move());
        System.out.println(p2);
    }
}
