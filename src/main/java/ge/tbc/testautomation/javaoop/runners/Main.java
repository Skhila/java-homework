package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;

public class Main {
    public static void main(String[] args){

//        Task: Java Abstract Classes & Interfaces
        Circle c1 = new Circle(11);
        Circle c2 = new Circle(-11);

        System.out.println("** Area/Length **");
        System.out.printf("c1 Area: %,.3f \n", c1.getArea());
        System.out.printf("c2 Length: %,.3f \n", c2.getLength());

        System.out.println("** Package Names **");
        c1.printPackageName();
        c2.printPackageName();

        System.out.println("** Double sized / Custom sized Circles **");
        c1 = c1.returnDoubleSizedCircle(c1);
        System.out.printf("Double sized c1's radius: %,.3f \n", c1.getRadius());

        c2 = c2.returnCustomSizedCircle(c2, 11);
        System.out.printf("Custom sized c2's radius(multiplied by 11): %,.3f \n", c2.getRadius());

        System.out.println("** Circle validation **");
        System.out.printf("c1 is valid: %b \n", c1.validateCircle(c1));
        System.out.printf("c2 is valid: %b \n", c2.validateCircle(c2));

    }
}
