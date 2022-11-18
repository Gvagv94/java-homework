package ge.tbc.testautomation.annotationAndComparators;

public class Rectangle {
    private double a,b;
    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    // Getter
    public Double getA() {
        return this.a;
    }
    public Double getB() {
        return this.b;
    }

    // Setter
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Double getArea(){
        return getA()*getB();
    }



    public String toString() {
        return "A: " + getA() +" B:"+ getB() + " მართკუთხედის ფართობი:" + getArea();
    }


    }