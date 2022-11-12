package ge.tbc.testautomation.exceptionsStringOperations.runners;


import ge.tbc.testautomation.exceptionsStringOperations.exceptions.LimitException;
import ge.tbc.testautomation.exceptionsStringOperations.exceptions.RadiusException;
import ge.tbc.testautomation.exceptionsStringOperations.figures.Circle;

public class Main {
    public static void main(String[] args) throws LimitException, RadiusException {

        try {

            Circle  stringrameCircle = new Circle(-7);

            stringrameCircle.setRadius(-7);
            System.out.println(stringrameCircle.getRadius());

        }
        catch (RadiusException e){
            System.out.println(e.getMessage());
        }



         //თუ გამოვიძახებთ ხუთზე მეტჯერ, გამოვა შეცდომა და გაითიშება პროგრამა
      try {
          Circle stringrameCircle7 = new Circle(7);

          stringrameCircle7.setRadius(7);
          System.out.println(stringrameCircle7.getRadius());

          Circle stringrameCircle1 = new Circle(7);
          stringrameCircle1.setRadius(7);
          System.out.println(stringrameCircle1.getRadius());

          Circle stringrameCircle2 = new Circle(7);
          stringrameCircle2.setRadius(7);
          System.out.println(stringrameCircle2.getRadius());

          Circle stringrameCircle3 = new Circle(7);
          stringrameCircle3.setRadius(7);
          System.out.println(stringrameCircle3.getRadius());

          Circle stringrameCircle4 = new Circle(7);
          stringrameCircle4.setRadius(7);
          System.out.println(stringrameCircle4.getRadius());

          Circle stringrameCircle5 = new Circle(7);
          stringrameCircle5.setRadius(7);
          System.out.println(stringrameCircle5.getRadius());

      } catch (LimitException e) {
          System.out.println(e.getMessage());
      }

      catch (RadiusException e) {
          System.out.println(e.getMessage());
      }


        String str = "Test Automation Bootcamp 6, 2022";

        String str_1 = "Automation";



        if(str.contains(str_1)){
            int y = str.indexOf(str_1);
            String u = str.substring(y , y+(str_1.length()));
            System.out.println(u.toLowerCase());
        }

        System.out.println("წინადადების გადაქცევა სტრიქონებად:");



        String[] strArray = null;
        strArray = str.split(" ");
        for (int i = 0; i < strArray.length; i++){
            System.out.println(strArray[i]);

        }

        System.out.println(str.length() + " სიტყვის სიგრძე");

        String rs = str.replace(" ", "-");
        System.out.println(rs);

    }
}
