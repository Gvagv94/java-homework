package ge.tbc.testautomation.runners;


import ge.tbc.testautomation.figures.Rectangle;
import ge.tbc.testautomation.figures.Triangle;


public class Main {

    private static ge.tbc.testautomation.figures.Rectangle Rectangle;

    public Main(int a, int b, int c, int h) {
    }

    public static void main(String[] args) {
        Triangle Triangle = new Triangle(5, 7, 10);
        Rectangle Rectangle = new Rectangle(5,7);
        Triangle Triangle1 = new Triangle(5,7,10,15);

        System.out.println(ge.tbc.testautomation.figures.Triangle.getPerimeter());
        System.out.println(ge.tbc.testautomation.figures.Rectangle.getArea());
        System.out.println(Triangle);




    }
}
