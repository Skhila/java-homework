package ge.tbc.testautomation.javaoop.figures;

import java.text.DecimalFormat;

public class Circle {
    private double radius;
    public static int numberOfCircleInstances;

    public Circle(double radius){
        this.setRadius(radius);
        numberOfCircleInstances++;
    }

    public double getRadius(){
        DecimalFormat formatOutput = new DecimalFormat("#.#####");
        return Double.parseDouble(formatOutput.format(this.radius));
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }


}
