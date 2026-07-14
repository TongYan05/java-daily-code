package com.anu.basic;

public class circle {
    private double radius;
    private final double PAI=3.14;

    public void setRadius(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }



    public void area(){
        double area = PAI * radius * radius;
        System.out.println("Area of circle is " + area);
    }
    public void perimeter(){
        double perimeter = 2 * PAI * radius;
        System.out.println("Parameter of circle is " + perimeter);
    }

}
