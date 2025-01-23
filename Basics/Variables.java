package Basics;

import java.util.Scanner;

public class Variables {
    public static void main(String args[]){
        System.out.println("Hello World with java");

        String name = "sudhanshu modi";
        Integer age = 24;
        Double price = 50.5;
        
        price = 50000.5;

        System.out.println(name);
        System.out.println(age);
        System.out.println(price);
        
        Scanner sc = new Scanner(System.in);
        String newName = sc.nextLine();
        System.out.println(newName);
    }
}
