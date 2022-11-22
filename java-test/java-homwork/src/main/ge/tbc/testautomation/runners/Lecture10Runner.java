package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.annotationAndComparators.Rectangle;

import java.lang.reflect.Field;
import java.util.Arrays;
import ge.tbc.testautomation.annotationAndComparators.Rectangle;
import ge.tbc.testautomation.generics.AnyPair;
import ge.tbc.testautomation.generics.FigurePair;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Lecture10Runner {
    private static <K,D> AnyPair<Field[], Field[]> getDeclaredFields(K objOne, D objTwo){
        return new AnyPair<>(objOne.getClass().getFields(), objTwo.getClass().getFields());
    }
    public static void main(String[] args) {
        AnyPair<Field[], Field[]> anyPair = getDeclaredFields( 40, "რამე სტრიქონი");
        System.out.println(Arrays.asList(anyPair.getElementOne()));
        System.out.println(Arrays.asList(anyPair.getElementTwo()));


        ge.tbc.testautomation.runners.Circle circle = new ge.tbc.testautomation.runners.Circle(40);
        Rectangle rec = new Rectangle(40,41);
        FigurePair<Circle,Rectangle> figurePair = new FigurePair<>(circle,rec);
        System.out.println(figurePair);
    }
}

