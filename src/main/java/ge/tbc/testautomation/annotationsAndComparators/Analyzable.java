package ge.tbc.testautomation.annotationsAndComparators;

public class Analyzable {
    @VariableNameAnnotation()
    String string1 = "String 1";

    @VariableNameAnnotation(name = "different name")
    double double1 = 1.1;

    @VariableNameAnnotation(name = "String2")
    String string2 = "String 2";

    @VariableNameAnnotation(name = "Boolean1")
    boolean boolean1 = true;

    @VariableNameAnnotation(name = "Boolean2")
    boolean boolean2 = false;

    @VariableNameAnnotation(name = "Char1")
    char char1 = 'a';

    @VariableNameAnnotation(name = "Char2")
    char char2 = 'b';

    @VariableNameAnnotation(name = "Double2")
    double double2 = 2.2;

    @VariableNameAnnotation(name = "String3")
    String string3 = "String 3";

    @VariableNameAnnotation(name = "Boolean3")
    boolean boolean3 = true;

    @VariableNameAnnotation(name = "Char3")
    char char3 = 'c';
}
