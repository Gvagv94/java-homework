package ge.tbc.testautomation.figures;

public class Rectangle extends Figure {

    public Rectangle(int a, int b) {
        super();
    }

    static void doublea() {
        System.out.println(5);
    }


    static void doubleb(){
      System.out.println(7);
    }



    static int a = 5;
    static int b = 7;

    public static double getPerimeter() {
        return (a + b) * 2;
    }


    public static double getArea() {
        return a * b;
    }

    //public Rectangle (double a, double b) {
       // this.a = a;
       // this.b = b;
    //}

    public static void main(String[] args) {
        System.out.println(a + b);
        System.out.println(a * b);

    }


     private double radius;
     public Rectangle() {
    this.radius = radius;
   }
    public void getRadius() {
     }
}
