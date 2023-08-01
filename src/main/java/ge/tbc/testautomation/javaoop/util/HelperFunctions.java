package ge.tbc.testautomation.javaoop.util;

import ge.tbc.testautomation.javaoop.figures.Rectangle;

public class HelperFunctions {

//    This method compares perimeters of two rectangles
    public static void compareRectangles(Rectangle r1, Rectangle r2){
        double r1Perimeter = r1.getLength();
        double r2Perimeter = r2.getLength();

        if (r1Perimeter > r2Perimeter){
            System.out.println("perimeter #1 > perimeter #2");
        }else if(r2Perimeter > r1Perimeter){
            System.out.println("perimeter #1 < perimeter #2");
        }else{
            System.out.println("perimeter #1 = perimeter #2");
        }
    }
}
