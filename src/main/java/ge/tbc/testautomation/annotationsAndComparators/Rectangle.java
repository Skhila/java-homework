package ge.tbc.testautomation.annotationsAndComparators;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

//    Rectangle Area
    public double getArea(){
        return a * b;
    }

//    toString
    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
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
}
