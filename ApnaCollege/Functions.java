package ApnaCollege;

import java.util.Scanner;

public class Functions {

    public static void printMyName(String name) {
        System.out.println("hello " + name);
    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static void factorial(int num) {
        if (num < 0) {
            System.out.println("Invalid Number");
            return;
        }
        int result = 1;
        for (int i = num; i > 1; i--) {
            result *= i;
        }
        System.out.println(result);
    }

    // Home work
    public static void isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number");
                return;
            }
        }
        System.out.println(num + " is a prime number");
    }

    public static void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is a even number");
        } else {
            System.out.println(num + " is not a even number");
        }
    }

    public static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        // printMyName(name);

        // System.out.print("Enter no. a: ");
        // int a = sc.nextInt();
        // System.out.print("Enter no. b: ");
        // int b = sc.nextInt();
        // int sum = calculateSum(a,b);
        // System.out.println("Sum is: "+sum);

        // System.out.print("Enter no. a: ");
        // int a = sc.nextInt();
        // System.out.print("Enter no. b: ");
        // int b = sc.nextInt();
        // int product = calculateProduct(a,b);
        // System.out.println("Product is: "+product);

        // System.out.print("Enter num for factorial: ");
        // int num = sc.nextInt();
        // factorial(num);

        // Home Work

        // System.out.print("Enter num to check prime: ");
        // int num = sc.nextInt();
        // isPrime(num);

        // System.out.print("Enter num to check even: ");
        // int num = sc.nextInt();
        // isEven(num);

        // System.out.print("Enter num to prine table: ");
        // int num = sc.nextInt();
        // printTable(num);

    }
}
