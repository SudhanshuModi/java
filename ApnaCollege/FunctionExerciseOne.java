package ApnaCollege;

import java.util.Scanner;

public class FunctionExerciseOne {

    public static void avgOfThreeNum(Scanner sc){
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int avg = (num1+num2+num3)/3;
        System.out.println("Average of three numbers are: "+ avg);
    }

    public static void sumOFOddNum(Scanner sc){
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=num; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println("Sum of Odd Numbers are: "+sum);
    }

    public static void findGreater(Scanner sc){
        int num1 = sc.nextInt();
        int num2= sc.nextInt();
        int greater = num1 > num2? num1: num2;
        System.out.println("Greater number is: "+ greater);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Enter 3 numbers from the user & make a function to print their average.
        // avgOfThreeNum(sc);

        // Write a function to print the sum of all odd numbers from 1 to n.
        // sumOFOddNum(sc);

        // Write a function which takes in 2 numbers and returns the greater of those two.
        // findGreater(sc);

    }
}
