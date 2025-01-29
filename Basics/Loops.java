package Basics;

public class Loops {
    public static void main(String args[]) {
        // forLoop();
        // whileLoop();
        doWhile();
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

    public static void doWhile() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i == 7);
    }
}
