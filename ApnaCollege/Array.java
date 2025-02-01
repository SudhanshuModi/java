package ApnaCollege;

import java.util.Scanner;

public class Array {

    public static void findNumberInArray(Scanner sc) {
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter current number: ");
            int currentValue = sc.nextInt();
            arr[i] = currentValue;
        }

        System.out.print("Enter number to search: ");
        int searchFor = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchFor) {
                System.out.println("Your number is at position: " + i);
                return;
            }
        }

        System.out.println(searchFor + " number is not present in the array");
        return;
    }

    // Home Work
    public static void inputOutputNames(Scanner sc) {
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        String[] names = new String[size];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.next();
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static void minMaxInArray() {
        int[] arr = { 11, 22, 3, 4, 5 };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("min: " + min + " and max: " + max);
    }

    public static void isInAscOrder(int[] arr) {
        boolean isAsc = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAsc = false;
                System.out.println("Array is not in asc order.");
                return;
            }
        }
        System.out.println("Array is in asc order.");
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take an array as input from the user. Search for a given number x and print
        // the index at which it occurs.
        // findNumberInArray(sc);

        // Home Work
        // Take an array of names as input from the user and print them on the screen.
        // inputOutputNames(sc);

        // Find the maximum & minimum number in an array of integers.
        // minMaxInArray();

        // Take an array of numbers as input and check if it is an array sorted in
        // ascending order.
        // Eg : { 1, 2, 4, 7 } is sorted in ascending order.
        // { 3, 4, 6, 2 } is not sorted in ascending order.
        // int[] a = { 1, 2, 4, 7 };
        // int[] b = { 3, 4, 6, 2 };
        // isInAscOrder(a);
        // isInAscOrder(b);

    }
}
