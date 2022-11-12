package ge.tbc.testautomation.exceptionsStringOperations.figures;

public class Figure {
    public static int numberOfInstances = 0;

    public Figure() {
            numberOfInstances++;
        }
        public static int getNumberOfInstances () {
            return numberOfInstances;
        }
    }
