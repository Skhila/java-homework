package ge.tbc.testautomation.javaoop.figures;

public class Rectangle extends Figure{
    private double a;
    private double b;

    public Rectangle(){}
    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

//    Overridden Functions
    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }

//    Getter/Setter
    public double getA(){
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
}
