package calculator;

import java.util.Scanner;

public class HomeWorkA {


    public static int doAddition(int x, int y) {
        int addition = x + y;
        return addition;
    }

    public static int doSubtraction(int x, int y) {
        int subtraction = x - y;
        return subtraction;
    }

    public static int doMultiplication(int x, int y) {
        int multiplication = x * y;
        return multiplication;
    }

    public static int doDivision(int x, int y) {
        int division = x / y;
        return division;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your Operation");
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");


        int choose = scan.nextInt();
        System.out.println("Enter two numbers");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (choose == 1) {
            System.out.println("The answer is : " + doAddition(x, y));
        } else if (choose == 2) {
            System.out.println("The answer is : " + doSubtraction(x, y));
        } else if (choose == 3) {
            System.out.println("The answer is :" + doMultiplication(x, y));
        } else if (choose == 4) {
            System.out.println("The answer is : " + doDivision(x, y));
        } else {
            System.out.println("It is out of range");
        }


    }
}









