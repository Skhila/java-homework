package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.annotationsAndComparators.Analyzable;
import ge.tbc.testautomation.annotationsAndComparators.RectangleComparator;
import ge.tbc.testautomation.annotationsAndComparators.VariableNameAnnotation;
import ge.tbc.testautomation.annotationsAndComparators.Rectangle;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args){
//        Task #6
        System.out.println("** Check if Annotation names equal field names in Analyzable class **");
        Field[] analyzableFields = Analyzable.class.getDeclaredFields();
        String fieldAnnotationName;
        for (Field field : analyzableFields){
            fieldAnnotationName = field.getAnnotation(VariableNameAnnotation.class).name();
            if (!fieldAnnotationName.equalsIgnoreCase(field.getName())){
                System.out.println("VARIABLE NAME MISMATCH FOUND");
            }
        }

//        Task #7
        int unusedInt = 8;
        boolean unusedBoolean = false;
        String unusedString = "Hello, I'm Unused String";

//        Task #8
        System.out.println("** Sorting Integer ArrayList **");
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Collections.addAll(integerArrayList, 11, 22, 33, 5, 2, 6, 7, 1, 3, 4);
        Collections.sort(integerArrayList);
        System.out.println("Sorted Integer Arraylist: " + integerArrayList);

//        Task #13-14
        System.out.println("** Reverse sorting Rectangle List using custom comparator **");
        List<Rectangle> rectangleList = new ArrayList<>();
        Collections.addAll(rectangleList, new Rectangle(1, 2), new Rectangle(3, 4), new Rectangle(5, 6),
                                          new Rectangle(7, 8), new Rectangle(9, 10), new Rectangle(11, 12),
                                          new Rectangle(13,14), new Rectangle(15, 16), new Rectangle(17, 18),
                                          new Rectangle(19,20));
        RectangleComparator rectangleComparator = new RectangleComparator();
        rectangleList.sort(rectangleComparator);
        System.out.println("Reverse sorted Rectangle List: " + rectangleList);
    }
}
