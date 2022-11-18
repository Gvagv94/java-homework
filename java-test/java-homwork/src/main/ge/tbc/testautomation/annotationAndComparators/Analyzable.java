package ge.tbc.testautomation.annotationAndComparators;

import java.util.ArrayList;

public class Analyzable {
    @VariableNameAnnotation(name = "someIntegerElement")
    int someIntegerElement = 7;

    @VariableNameAnnotation(name = "SomeStringElement")
    String someStringElement = "Titsian";

    @VariableNameAnnotation(name = "SomeFloatElement")
    float someFloatElement = 5.5f;

    @VariableNameAnnotation(name = "SomeElement")
    char someCharElement = 'A';

    @VariableNameAnnotation()
    boolean someBooleanElement = true;

    @VariableNameAnnotation()
    byte someByteElement = 'a';

    @VariableNameAnnotation()
    short someShortElement = 33;

    @VariableNameAnnotation()
    long someLongElement = 1;

    @VariableNameAnnotation()
    double someDoubleElement = 1;

    @VariableNameAnnotation()
    ArrayList<String> someArrayElements = new ArrayList<String>();




}
