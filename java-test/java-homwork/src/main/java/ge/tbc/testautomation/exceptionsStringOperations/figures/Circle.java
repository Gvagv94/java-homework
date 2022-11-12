package ge.tbc.testautomation.exceptionsStringOperations.figures;

import ge.tbc.testautomation.exceptionsStringOperations.exceptions.LimitException;
import ge.tbc.testautomation.exceptionsStringOperations.exceptions.RadiusException;

public class Circle extends Figure {


    private double radius;



    public Circle (double radius) throws LimitException, RadiusException {


            if (super.getNumberOfInstances() > 5) {


                throw new LimitException("INSTANTIATION LIMIT REACHED");

            }
            if (radius < 0) {

                throw new RadiusException("RADIUS VALUE NOT VALID");

            }

        }


    //setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //get
    public double getRadius() {
        return radius;
    }








}





   /*   public class Circle {
          private double radius = 1;
          private static int numberOfObjects = 0;
          public Circle() {
              numberOfObjects++;
              public Circle(double newRadius = 0){
                  radius = newRadius;
                  numberOfObjects++;
              }
              public double getRadius() {
                  return radius;
              }
              public void setRadius(double newRadius){
                  radius = (newRadius >= 0) newRadius : 0;
              }
              }
          }

}
*/
