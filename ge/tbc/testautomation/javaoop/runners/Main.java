package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;

import java.util.Random;

public class Main {
    public static void main(String[] args){

        String circleString;

//        Circle #1
        Circle c1 = createCircle();
        circleString = Util.circleToString(c1);

        System.out.println(Circle.numberOfCircleInstances);
        System.out.println(circleString);

//        Circle #2
        Circle c2 = createCircle();
        circleString = Util.circleToString(c2);

        System.out.println(Circle.numberOfCircleInstances);
        System.out.println(circleString);

//        Circle #3
        Circle c3 = createCircle();
        circleString = Util.circleToString(c3);

        System.out.println(Circle.numberOfCircleInstances);
        System.out.println(circleString);

//        Circle #4
        Circle c4 = createCircle();
        circleString = Util.circleToString(c4);

        System.out.println(Circle.numberOfCircleInstances);
        System.out.println(circleString);

//        Circle #5
        Circle c5 = createCircle();
        circleString = Util.circleToString(c5);

        System.out.println(Circle.numberOfCircleInstances);
        System.out.println(circleString);


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
    }

    public static double generateRandomRadius(){
        Random rand = new Random();
        return rand.nextDouble(77);
    }

    public static Circle createCircle(){
        return new Circle(generateRandomRadius());
    }
}
