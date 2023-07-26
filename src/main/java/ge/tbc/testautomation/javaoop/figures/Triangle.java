package ge.tbc.testautomation.javaoop.figures;

import java.util.Random;

public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(){}
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = generateRandomHeight();
    }

//    Overridden Functions
    @Override
    public double getArea() {
//        For example: B is a Base and H is a Height
        return b*h/2;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

//    Getter/Setter
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

//    Generate random Height for triangle
    public static double generateRandomHeight(){
        Random random = new Random();
        return random.nextDouble(20);
    }
}
