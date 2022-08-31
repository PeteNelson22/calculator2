package calcpractice;

import java.util.Scanner;

public class CalcPractice {

    public static void main(String[] args) {
        int a, b = 0;
        boolean status = true;

        while (status == true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose your option");
            System.out.println("1. Simple Calculator");
            System.out.println("2. Scientific Calculator");
            int option = sc.nextInt();
            if (option == 1) {
                // Scanner scan = new Scanner(System.in);
                System.out.println("1.Addition");
                System.out.println("2.Subtraction");
                System.out.println("3.Division");
                System.out.println("4.Multiplication");
                System.out.println("5.Modulus");

                int input = sc.nextInt();
                if (input == 1) {
                    System.out.println("Enter first number");
                    a = sc.nextInt();
                    System.out.println("Enter second number");
                    b = sc.nextInt();
                    System.out.println("Addition = " + (a + b));
                } else if (input == 2) {
                    System.out.println("Enter first number");
                    a = sc.nextInt();
                    System.out.println("Enter second number");
                    b = sc.nextInt();
                    System.out.println("Subtraction = " + (a - b));
                } else if (input == 3) {
                    System.out.println("Enter first number");
                    a = sc.nextInt();
                    System.out.println("Enter second number");
                    try {
                        if ((b = sc.nextInt()) == 0) {
                            throw new ArithmeticException();
                        } else {
                            double i = a;
                            double j = b;
                            System.out.println("Division = " + (i / j));
                        }
                    } catch (ArithmeticException e) {
                        System.out.println("Can't divide by zero");
                    }
                } else if (input == 4) {
                    System.out.println("Enter first number");
                    a = sc.nextInt();
                    System.out.println("Enter second number");
                    b = sc.nextInt();
                    System.out.println("Multiplication = " + (a * b));

                } else if (input == 5) {
                    System.out.println("Enter first number");
                    a = sc.nextInt();
                    System.out.println("Enter second number");
                    b = sc.nextInt();
                    System.out.println("Modulus  of " + a + " and " + b + " = " + (a % b));

                } else {
                    System.out.println("Wrong input");
                }
            }
            if (option == 2) {

                double c = 0;
                Scanner scan = new Scanner(System.in);
                System.out.println("Choose your option");
                System.out.println("1.Square Root");
                System.out.println("2.Power");
                System.out.println("3.Logarithm");
                System.out.println("4.Sine");
                System.out.println("5.Cosine");
                System.out.println("6.Tangent");
                int input = scan.nextInt();
                if (input == 1) {
                    System.out.println("Enter number");
                    c = scan.nextInt();
                    System.out.println("Square root of " + c + " = " + Math.sqrt(c));
                } else if (input == 2) {
                    System.out.println("Enter number");
                    c = scan.nextInt();
                    System.out.println("Enter the power");
                    b = scan.nextInt();
                    System.out.println("Answer = " + Math.pow(c, b));
                } else if (input == 3) {
                    System.out.println("Enter number");
                    c = scan.nextDouble();
                    System.out.println("Logarithm of " + c + " = " + Math.log10(c));
                } else if (input == 4) {
                    System.out.println("Enter number");
                    c = scan.nextDouble();
                    System.out.println("Sine of " + c + " = " + Math.sin(Math.toRadians(c)));
                } else if (input == 5) {
                    System.out.println("Enter number");
                    c = scan.nextDouble();
                    System.out.println("Cosine of " + c + " = " + Math.cos(Math.toRadians(c)));
                } else if (input == 6) {
                    System.out.println("Enter number");
                    c = scan.nextDouble();
                    System.out.println("Tangent of " + c + " = " + Math.tan(Math.toRadians(c)));
                } else {
                    System.out.println("Wrong input");
                }

            }
        }
    }
}
