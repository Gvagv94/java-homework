package ge.tbc.testautomation.runners;

import ge.tbc.testautomation.annotationAndComparators.Analyzable;
import ge.tbc.testautomation.annotationAndComparators.Rectangle;
import ge.tbc.testautomation.annotationAndComparators.RectangleComparator;
import ge.tbc.testautomation.annotationAndComparators.VariableNameAnnotation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Lecture9Runner {
    public static void main(String[] args) {

        Field[] fields = Analyzable.class.getDeclaredFields();

        for (Field field : fields) {
            String variableName = field.getName();
            VariableNameAnnotation[] annotations = field.getAnnotationsByType(VariableNameAnnotation.class);
            for (VariableNameAnnotation annotation : annotations) {
                if (variableName.equalsIgnoreCase(annotation.name())) {
                    System.out.println(annotation.name());
                } else {
                    System.out.println("VARIABLE NAME MISMATCH FOUND");
                }
            }
        }
        @SuppressWarnings("unused")
        int someInt;
        @SuppressWarnings("unused")
        String someStr;
        @SuppressWarnings("unused")
        boolean someBoolean;

        ArrayList<Integer> someArrayElements = new ArrayList<Integer>();
        for (int i = 10; i > 0; i--) {
            someArrayElements.add(i);
        }
        System.out.println(someArrayElements);
        Collections.sort(someArrayElements);
        System.out.println(someArrayElements);
        Rectangle rectangle1 = new Rectangle(12,13);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(5,15);
        System.out.println(rectangle2);

        RectangleComparator com = new RectangleComparator();
        System.out.println(com.compare(rectangle1,rectangle2));

        //12,13,14 დავაკებები

        Random r = new Random();

        RectangleComparator comp = new RectangleComparator();

        Rectangle[] squarList = new Rectangle[10];

        for (int i = 0; i < squarList.length; i++)
        {
            int x = r.nextInt(9) + 1;
            int y = r.nextInt(9) + 1;
            squarList[i] = new Rectangle(x, y);
        }

        System.out.println("სორტირებამდე");
        for(int i =0; i< squarList.length;i++){
            System.out.println(squarList[i]);
        }

        Arrays.sort(squarList, comp);
        System.out.println("სორტირების შემდეგ");
        for(int i =0; i< squarList.length;i++){
            System.out.println(squarList[i]);
        }
    }
}





