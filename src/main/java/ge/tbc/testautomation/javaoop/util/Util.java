package ge.tbc.testautomation.javaoop.util;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;

public class Util {
    public static String circleToString(Circle circle){
        String returnMessage = "[Circle: radius - " + circle.getRadius() + "]";
        return returnMessage;
    }


}
