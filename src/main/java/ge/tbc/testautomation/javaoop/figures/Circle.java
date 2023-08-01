package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizableCircle;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidCircle;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;

import java.text.DecimalFormat;

public class Circle extends Figure implements IResizableCircle, IValidCircle {
    private final DecimalFormat formatOutput = new DecimalFormat("#.###");
    public static final double PI = Math.PI;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
//        if (numberOfInstances > 5) throw new LimitException("INSTANTIATION LIMIT REACHED");
//        else if (radius < 0) throw new RadiusException("RADIUS VALUE NOT VALID");
//        else this.setRadius(radius);
    }

//    Overridden methods
    @Override
    public double getArea() {
        double area =  PI*Math.pow(this.radius, 2);
        return Double.parseDouble(formatOutput.format(area));
    }

    @Override
    public double getLength() {
        double length =  2*PI*radius;
        return Double.parseDouble(formatOutput.format(length));
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackage());
    }
    //  Methods inherited from Interface (IResizableCircle)
    @Override
    public Circle returnDoubleSizedCircle(Circle circle) {
        circle.setRadius(circle.getRadius()*2);
        return circle;
    }

    @Override
    public Circle returnCustomSizedCircle(Circle circle, double byValue) {
        circle.setRadius(circle.getRadius()*byValue);
        return circle;
    }

    //  Method inherited from Interface (IValidCircle)
    @Override
    public boolean validateCircle(Circle circle) {
        return circle.getRadius() > 0;
    }

//    Getter/Setter
    public double getRadius(){
        return Double.parseDouble(formatOutput.format(this.radius));
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }


}
