package ApnaCollege;

public class BasicPattern {
    public static void main(String args[]) {
        // rectangle();
        // hollowRectangle();
        // halfPyramid();
        // invertedHalfPyramid();
        // invertedHalfPyramid180Degree();
        // halfPyramidWithNumbers();
        // invertedHalfPyramidWithNumbers();
        // floydsTriangle();
        zeroOneTriangle();
    }

    public static void rectangle() {
        int row = 4;
        int column = 4;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void hollowRectangle() {
        int row = 4;
        int column = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i == 1 || j == 1 || i == row || j == column) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void halfPyramid() {
        int num = 4;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid() {
        int num = 4;

        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid180Degree() {
        int num = 4;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void halfPyramidWithNumbers() {
        int num = 5;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramidWithNumbers() {
        int num = 5;

        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floydsTriangle() {
        int num = 5;
        int number = 1;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle() {
        int num = 5;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                System.out.print(sum % 2 == 0 ? "1 " : "0 ");
            }
            System.out.println();
        }
    }

}