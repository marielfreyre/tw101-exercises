package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {

        int spaceNum = n-1;
        int starNum = 1;
        for(int rowNum=0; rowNum<n; rowNum++) {
            for(int i=0; i<spaceNum; i++){
                System.out.print(" ");
            }
            for(int j=0; j<starNum; j++) {
                System.out.print("*");

            }
            spaceNum--;
            starNum = starNum+2;
            System.out.println(" ");
        }



    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        int spaceNum = n-1;
        int starNum = 1;
        for(int rowNum=0; rowNum<n; rowNum++) {
            for(int i=0; i<spaceNum; i++){
                System.out.print(" ");
            }
            for(int j=0; j<starNum; j++) {
                System.out.print("*");

            }
            spaceNum--;
            starNum = starNum+2;
            System.out.println(" ");
        }
        spaceNum++;
        starNum = starNum-2;
        for(int secondRowNum=0; secondRowNum<n; secondRowNum++) {
            for(int i=0; i<spaceNum; i++){
                System.out.print(" ");
            }
            for(int j=0; j<starNum; j++) {
                System.out.print("*");

            }
            spaceNum++;
            starNum = starNum-2;
            System.out.println(" ");
        }

    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        int spaceNum = n-1;
        int starNum = 1;
        for(int rowNum=0; rowNum<n; rowNum++) {
            for(int i=0; i<spaceNum; i++){
                System.out.print(" ");
            }
            for(int j=0; j<starNum; j++) {
                System.out.print("*");

            }
            spaceNum--;
            starNum = starNum+2;
            System.out.println(" ");
        }
        spaceNum++;
        starNum = starNum-2;
        System.out.println("  Mariel  ");
        for(int secondRowNum=0; secondRowNum<n; secondRowNum++) {
            for(int i=0; i<spaceNum; i++){
                System.out.print(" ");
            }
            for(int j=0; j<starNum; j++) {
                System.out.print("*");

            }
            spaceNum++;
            starNum = starNum-2;
            System.out.println(" ");
        }

    }
}
