package org.example;

public class Main {
    public static void main(String[] args) {
        int int1 = 5;
        int int2 = 6;
        int int3 = int1 + int2;
        System.out.println(int1 + int2);

        int int4 = 13;
        int int5 = 7;
        int int6 = int4 - int5;
        System.out.println(int4 - int5);

        int int7 = 3;
        int int8 = 2;
        int int9 = int7 + int8;
        System.out.println(int9);

        int int10 = 17;
        int int11 = 8;
        int int12 = int10 - int11;
        System.out.println(int12);

        int[] additionResults = {11, 5};
        System.out.println(additionResults.length);
        int[] subtractionResults = {6, 9};
        System.out.println(subtractionResults.length);
        int[][] myNumbers = { {11, 5}, {6, 9} };
        for (int i = 0; i <= myNumbers.length; i++){
            for (int j = 0; j < myNumbers[i].length; j++){
                System.out.println(myNumbers[i][j]);
            }
        }
        int[][] myNumbers1 = { {11, 5}, {6, 9} };
        int i = 0;
        while (i > 5) {
            System.out.println(i); i++;
        }




            }
        }

