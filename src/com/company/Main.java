package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean opc = false;

        do {
           menu();
           System.out.println("Want do a new operation ? y or n");
           opc = input.next().charAt(0) == 'y';
        } while (opc);

    }

    private static void menu(){
        Scanner input = new Scanner(System.in);
        char operation = getOperation(input);

        System.out.println("Number 1: ");
        double number = input.nextDouble();
        System.out.println("Number 2: ");
        double number2 = input.nextDouble();

        double total = computeValues(number, number2, operation);

        System.out.println("Total: " + total);
    }
    private static double division(double number, double number2){
        if (number > 0 && number2 == 0){
            System.out.println("Division by ZERO!!!");
            System.exit(1);
        }else if (number < 0 && number2 == 0){
            System.out.println("Division by ZERO!!!");
            System.exit(1);
        }

        return number / number2;
    }

    private static double multiplication(double number, double number2){
        return number * number2;
    }

    private static double subtraction(double number, double number2){
        return number - number2;
    }

    private static double sum(double number, double number2){
        return number + number2;
    }

    private static double computeValues(double number, double number2, char operation) {
        double total = 0;
        switch (operation) {
            case '*' -> total = multiplication(number,number2);
            case '/' -> total = division(number,number2);
            case '+' -> total = sum(number,number2);
            case '-' -> total = subtraction(number,number2);
            default -> System.out.println("Error: invalid operator");
        }
        return total;
    }

    private static char getOperation(Scanner input) {
        System.out.println("Chose one");
        System.out.println("* = Multiplication\n/ = Division\n+ = Sum\n- = Subtraction");
        return input.next().charAt(0);
    }
}
