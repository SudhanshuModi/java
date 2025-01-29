package Basics;

import java.util.Scanner;

public class Loops {
    public static void main(String args[]) {
        // forLoop();
        // whileLoop();
        // doWhileLoop();
        
        Scanner sc = new Scanner(System.in);
        // SumOfNaturalNo(sc);
        tableOfNumber(sc);
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
    public static void tableOfNumber(Scanner sc){
        int n = sc.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(n *i);
        }
    }

}
