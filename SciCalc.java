/**
 * Description: Program that calculates basic math functions
 *
 * @author Ayana Bando
 * @since 2022-07-18
 */

import java.util.Scanner;
import java.util.Random;

public class SciCalc {

    public static void main(String[] args) {

        System.out.println("=======================");
        System.out.println("        SCICALC");
        System.out.println("=======================");
        System.out.println();

        // ========== INSERT YOUR CODE HERE ==========
        //ask for user input and store to pass to methods
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        //display menu options for user to choose from
        displayMenu();

        System.out.println("Please select a function:");
        int menuOption = sc.nextInt();
        // use menuOption to call methods to perform mathematical function
        switch (menuOption) {
            case 1:
                int sum = add(num1, num2);
                System.out.println("\nThe result of " + num1 + " + " + num2 + " is " + sum);
                break;
            case 2:
                int diff = sub(num1, num2);
                System.out.println("\nThe result of " + num1 + " - " + num2 + " is " + diff);
                break;
            case 3:
                int prod = mult(num1, num2);
                System.out.println("\nThe result of " + num1 + " * " + num2 + " is " + prod);
                break;
            case 4:
                double quot = div(num1, num2);
                System.out.println("\nThe result of " + num1 + " / " + num2 + " is " + quot);
                break;
            case 5:
                int remain = mod(num1, num2);
                System.out.println("\nThe result of " + num1 + " % " + num2 + " is " + remain);
                break;
            case 6:
                double expo = pow(num1, num2);
                System.out.println("\nThe result of " + num1 + " ^ " + num2 + " is " + expo);
                break;
            case 7:
                int firstNum = hailed(num1);
                int nextNum = hailed(num2);
                System.out.println("\nThe result of " + num1 + "  hailed is " + firstNum + " and the result of " + num2 + " hailed is " + nextNum);
                break;
            case 8:
                double length = hyp(num1, num2);
                System.out.println("\nThe hypotenuse of a right triangle with legs " + num1 + " and " + num2 + " is " + length);
                break;
            case 9:
                int larger = max(num1, num2);
                System.out.println("\nThe largest number of " + num1 + " and " + num2 + " is " + larger);
                break;
            case 10:
                int smaller = min(num1, num2);
                System.out.println("\nThe smallest number of " + num1 + " and " + num2 + " is " + smaller);
                break;
            default:
                System.out.println("You did not enter a valid choice.");
        }
        System.out.println("\nThank you for using =====SCICALC=====");
        // You will also need to include at least 11 methods (displayMenu() and
        // methods to handle each choice from the switch statement).

        // ===========================================        		

    }

    private static void displayMenu() {
        System.out.println("Please choose from the following menu:\n" +
                "  1. Add two numbers\n" +
                "  2. Subtract two numbers\n" +
                "  3. Multiply two numbers\n" +
                "  4. Divide two numbers\n" +
                "  5. Mod two numbers\n" +
                "  6. Exponentiate two numbers\n" +
                "  7. Find next Hailstone numbers for each of the two numbers\n" +
                "  8. Find the hypotenuse using two numbers as legs of a right triangle\n" +
                "  9. Find the largest of the two numbers\n" +
                "  10. Find the smallest of the two numbers\n");
    }

    //method accepts two integers and returns the sum
    public static int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    //method accepts two integers and returns the difference
    public static int sub(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    //method accepts two integers and returns the product
    public static int mult(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    //method accepts two integers and returns the floating point quotient
    public static double div(int firstNum, int secondNum) {
        return (double)firstNum/secondNum;
    }

    //method accepts two integers and returns the floating point remainder
    public static int mod(int firstNum, int secondNum) {
        return firstNum % secondNum;
    }

    //method accepts two integers and returns a floating point exponential value
    public static double pow(int firstNum, int secondNum) {
        return Math.pow(firstNum, secondNum);
    }

    //method accepts two integers and returns the hypotenuse
    public static double hyp(int firstNum, int secondNum) {
        int sqSum = (firstNum * firstNum) + (secondNum * secondNum);
        return Math.sqrt(sqSum);
    }

    //method accepts an integer and returns the Hailed number
    public static int hailed(int anyNum){
        if (anyNum % 2 == 0){
            anyNum = anyNum / 2;
        }else if(anyNum % 2 != 0){
            anyNum = (anyNum * 3) + 1;
        }
        return anyNum;
    }

    //method accepts two integers and returns the largest
    public static int max(int firstNum, int secondNum) {
        if(firstNum > secondNum){
            return firstNum;
        }
        return secondNum;
    }

    //method accepts two integers and returns the smallest
    public static int min(int firstNum, int secondNum) {
        if(firstNum < secondNum){
            return firstNum;
        }
        return secondNum;
    }

}


// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?

Figuring out how to hail a number


2. What will you always remember (never forget) from this exercise?
Sometimes StackOverflow takes you down the rabbit hole of nonsense



*/