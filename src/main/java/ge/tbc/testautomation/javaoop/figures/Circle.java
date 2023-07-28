package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;

import java.text.DecimalFormat;

public class Circle extends Figure{
    public static final double PI = 3.14;
    private double radius;
    public static int numberOfCircleInstances;

    public Circle(double radius){
        if (numberOfInstances > 5) throw new LimitException("INSTANTIATION LIMIT REACHED");
        else if (radius < 0) throw new RadiusException("RADIUS VALUE NOT VALID");
        else this.setRadius(radius);
    }

//    Overriden methods


    @Override
    public double getArea() {
        return PI*Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }

    public double getRadius(){
        DecimalFormat formatOutput = new DecimalFormat("#.#####");
        return Double.parseDouble(formatOutput.format(this.radius));
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }


}
