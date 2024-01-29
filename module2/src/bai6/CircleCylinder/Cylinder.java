package bai6.CircleCylinder;

import bai6.CircleCylinder.Circle;

public class Cylinder extends Circle {
    private double h=2;

    public Cylinder() {
    }


    public Cylinder(double radius, String color, double h) {
        super(radius, color);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    public double geVolume(){
        return Math.PI*Math.pow(getArea(),2)*this.h;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "h= " + h +"radius= "+super.getRadius()+"color= "+super.getColor()+
                '}';
    }
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);
        System.out.println(cylinder.geVolume());
        cylinder=new Cylinder(3.0,"black",1.0);
        System.out.println(cylinder);
        System.out.println(cylinder.geVolume());
    }

}