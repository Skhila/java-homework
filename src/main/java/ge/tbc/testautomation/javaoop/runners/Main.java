package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Figure;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.util.HelperFunctions;
import ge.tbc.testautomation.javaoop.util.Util;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
//      Task Java Exceptions & String Processing

//        Tasks #7-8 (Exception Handling)

        try{
//            Circle with negative Radius to Cause RadiusException
            Circle circle = new Circle(-3);
        } catch (RadiusException radiusException){
            System.out.println(radiusException.getMessage());
        }

//        Created 4 extra Circles to reach the limit
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(2);
        Circle c3 = new Circle(3);
        Circle c4 = new Circle(4);

        try{
//            This Circle caused a LimitException
            Circle circle = new Circle(5);
        }catch (LimitException limitException){
            System.out.println(limitException.getMessage());
        }

//        Task #9 (String Processing)
        String sentence = "Test Automation Bootcamp 6, 2022";
//        9.1
        String automationFromSentence = sentence.substring(sentence.indexOf("Automation"), sentence.indexOf("Automation") + "Automation".length()).toLowerCase();
        System.out.println(automationFromSentence);

//        9.2
        String[] sentenceArray = sentence.split(" ");
        for (String letter : sentenceArray){
            System.out.println(letter);
        }

//        9.3
        System.out.println("Length = " + sentence.length());

//        9.4
        String replacedSentence = sentence.replaceAll(" ", "-");
        System.out.println(replacedSentence);

//        Tasks #10-11 (Regex)

        String[] phoneNumbers = {"599-144-155-166", "595-57-77-77",
                                 "574-78-77-77", "592-87-77-78",
                                 "599-88-888-82", "555-99-99-90",
                                 "503-03-03-03", "592-87-77-78"
                                };

        for (String phoneNumber : phoneNumbers){
            System.out.print(phoneNumberValidation(phoneNumber) + "; ");
        }
//        Result: false; true; false; true; false; true; false; true;
    }

//    Function for Tasks #10-11
    private static boolean phoneNumberValidation(String phoneNumber){
        String phoneNumberPattern = "(5[59][529]\\d{6})";

        Pattern phoneNumberPatternCompiled = Pattern.compile(phoneNumberPattern);

        Matcher phoneNumberMatcher = phoneNumberPatternCompiled.matcher(phoneNumber.replaceAll("-", ""));

        return phoneNumberMatcher.matches();
    }
}
