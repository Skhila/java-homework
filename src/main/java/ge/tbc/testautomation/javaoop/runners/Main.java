package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.generics.AnyPair;
import ge.tbc.testautomation.generics.FigurePair;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        Integer integerForAnyPair = 11;
        String stringForAnyPair = "String";
        AnyPair<Field[], Field[]> declaredFields = getDeclaredFields(integerForAnyPair, stringForAnyPair);
        System.out.println("** Fields of Integer class **");
        System.out.println(Arrays.asList(declaredFields.getElementOne()));
        System.out.println("** Fields of String class **");
        System.out.println(Arrays.asList(declaredFields.getElementTwo()));

        Circle circle = new Circle(11);
        Rectangle rectangle = new Rectangle(11, 121);
        FigurePair<Circle, Rectangle> circleRectangleFigurePair = new FigurePair<>(circle, rectangle);
        System.out.println("** FigurePair of Circle and Rectangle **");
        System.out.println(circleRectangleFigurePair);
    }
    public static <K, D> AnyPair<Field[], Field[]> getDeclaredFields(K objOne, D objTwo){
        Field[] fieldsOfObjOne = objOne.getClass().getDeclaredFields();
        Field[] fieldsOfObjTwo = objTwo.getClass().getDeclaredFields();

        return new AnyPair<>(fieldsOfObjOne, fieldsOfObjTwo);
    }
}
