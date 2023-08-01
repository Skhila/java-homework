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

//    Overridden Methods
    @Override
    public double getArea() {
//        In this case B is a Base and H is a Height of a Triangle
        return b*h/2;
    }

    @Override
    public double getLength() {
        return a+b+c;
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackage());
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

//    Generate random Height for Triangle
    public static double generateRandomHeight(){
        Random random = new Random();
        return random.nextDouble(20);
    }

}
