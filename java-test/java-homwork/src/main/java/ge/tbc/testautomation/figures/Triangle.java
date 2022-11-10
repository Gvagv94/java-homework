package ge.tbc.testautomation.figures;

public class Triangle extends Figure {

    static int a = 5;
    static int b = 7;
    static int c = 10;
    static int h = 15;

    public Triangle(int a, int b, int c) {

    }

    public Triangle(int a, int b, int c, int h) {
        super();
    }


    public static double getPerimeter() {
        return (a + b + c);

    }

    public static double getArea() {
        return (b * h) / 2;

    }

    public void String (double a, double b, double c) {
        this.a = (int) a;
        this.b = (int) b;
        this.c = (int) c;

    }

    public static void main(String[] args) {
        System.out.println(getPerimeter());
        System.out.println(getArea());
    }

}
