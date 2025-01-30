package Basics;

import java.util.Scanner;

public class Loops {
    public static void main(String args[]) {
        // forLoop();
        // whileLoop();
        // doWhileLoop();

        Scanner sc = new Scanner(System.in);
        // SumOfNaturalNo(sc);
        // tableOfNumber(sc);

        // Home Work Section
        // evenNumberTillN(sc);
        menuDrivenProgram(sc);
    }

    public static void forLoop() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void whileLoop() {
        int i = 1;
        while (i <= 6) {
            System.out.println(i);
            i++;
        }
    }

    public static void doWhileLoop() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i == 7);
    }

    // Questions

    // Print the sum of First n Natural Numbers.
    public static void SumOfNaturalNo(Scanner sc) {
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    // Print the table of a number input by the user.
    public static void tableOfNumber(Scanner sc) {
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }

    // Home Work Section
    // Print all even numbers till n.
    public static void evenNumberTillN(Scanner sc) {
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /*
     * Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
     * If the user enters 1 then keep taking input from the user for a student’s
     * marks(out of 100).
     * If they enter 0 then stop.
     * If he/ she scores :
     * Marks >=90 -> print “This is Good”
     * 89 >= Marks >= 60 -> print “This is also Good”
     * 59 >= Marks >= 0 -> print “This is Good as well”
     * Because marks don’t matter but our effort does.
     * (Hint : use do-while loop but think & understand why)
     */
    public static void menuDrivenProgram(Scanner sc) {
        System.out.println("Enter 0 or 1");
        int input = sc.nextInt();
        do {
            System.out.println("Enter marks");
            int marks = sc.nextInt();

            if (marks >= 90) {
                System.out.println("This is Good");
            } else if (marks <= 89 && marks >= 60) {
                System.out.println("This is also Good");
            } else if (marks <= 59 && marks >= 0) {
                System.out.println("This is Good as well");
            }

            System.out.println("Enter 0 or 1");
            input = sc.nextInt();
        } while (input == 1);
    }
}
