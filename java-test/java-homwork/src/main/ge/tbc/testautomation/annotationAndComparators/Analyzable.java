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

    @VariableNameAnnotation(name = "someByteElement")
    byte someByteElement = 'a';

    @VariableNameAnnotation(name = "SomeShortElement")
    short someShortElement = 33;

    @VariableNameAnnotation(name = "SomeLongElement")
    long someLongElement = 1;

    @VariableNameAnnotation(name = "someDoubleElement")
    double someDoubleElement = 1;

    @VariableNameAnnotation(name = "SomeArrayElements")
    ArrayList<String> someArrayElements = new ArrayList<String>();




}
