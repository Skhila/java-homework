package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.util.HelperFunctions;
import ge.tbc.testautomation.javaoop.util.Util;

import java.util.Random;

public class Main {
    public static void main(String[] args){

//        TASK JAVA-OOP

//        String circleString;
//
////        Circle #1
//        Circle c1 = createCircle();
//        circleString = Util.circleToString(c1);
//
//        System.out.println(Circle.numberOfCircleInstances);
//        System.out.println(circleString);
//
////        Circle #2
//        Circle c2 = createCircle();
//        circleString = Util.circleToString(c2);
//
//        System.out.println(Circle.numberOfCircleInstances);
//        System.out.println(circleString);
//
////        Circle #3
//        Circle c3 = createCircle();
//        circleString = Util.circleToString(c3);
//
//        System.out.println(Circle.numberOfCircleInstances);
//        System.out.println(circleString);
//
////        Circle #4
//        Circle c4 = createCircle();
//        circleString = Util.circleToString(c4);
//
//        System.out.println(Circle.numberOfCircleInstances);
//        System.out.println(circleString);
//
////        Circle #5
//        Circle c5 = createCircle();
//        circleString = Util.circleToString(c5);
//
//        System.out.println(Circle.numberOfCircleInstances);
//        System.out.println(circleString);


////        I've done this homework with for-loop too;
//        String circleString;
//        Circle circle;
//
//        for(int i = 0; i < 5; i++){
//            circle = createCircle();
//            circleString = Util.circleToString(circle);
//
//            System.out.println(Circle.numberOfCircleInstances);
//            System.out.println(circleString);
//        }

//        TASK JAVA-OOP-2    //

//        Instantiate Objects

//        Rectangles
        System.out.println("*** Rectangle ***");
        Rectangle r1 = new Rectangle(10, 15);
        Rectangle r2 = new Rectangle(11, 22);

        double r1Area = r1.getArea();
        double r2Area = r2.getArea();
        System.out.println("Areas: ");
        System.out.println(r1Area);
        System.out.println(r2Area);

        double r1Perimeter = r1.getPerimeter();
        double r2Perimeter = r2.getPerimeter();
        System.out.println("Perimeters: ");
        System.out.println(r1Perimeter);
        System.out.println(r2Perimeter);

//        Comparison of perimeters
        System.out.println("Let's compare perimeters: ");
        HelperFunctions.compareRectangles(r1, r2);

//        Let's change parameters to check compareRectangles() functionality
        r1.setA(20);
        r1.setB(30);
        System.out.println("After Changing Parameters (r1.a = 20, r1.b = 30): ");
        HelperFunctions.compareRectangles(r1, r2);

        r2.setA(20);
        r2.setB(30);
        System.out.println("After Changing Parameters (equaled all parameters of both objects): ");
        HelperFunctions.compareRectangles(r1, r2);

//        Triangle

        System.out.println("*** Triangle ***");
        Triangle triangle = new Triangle(5, 10, 15);

        double triangleA = triangle.getA();
        double triangleB = triangle.getB();
        double triangleC = triangle.getC();
        double triangleH = triangle.getH();
        System.out.printf("Triangle parameters: side A = %,.2f; side B(Base) = %,.2f; side C = %,.2f; Height = %,.2f \n", triangleA, triangleB, triangleC, triangleH);

        double triangleArea = triangle.getArea();
        double trianglePerimeter = triangle.getPerimeter();
        System.out.printf("Triangle Perimeter = %,.2f; Triangle Area = %,.2f", trianglePerimeter, triangleArea);

    }

//        TASK JAVA-OOP
//    public static double generateRandomRadius(){
//        Random rand = new Random();
//        return rand.nextDouble(77);
//    }
//
//    public static Circle createCircle(){
//        return new Circle(generateRandomRadius());
//    }
}
