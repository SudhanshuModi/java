package ApnaCollege;

import java.util.Scanner;

public class TwoDArray {
    public static void twoDArrayDemo(Scanner sc) {
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void searchEleInMatrix(Scanner sc) {
        System.out.println("Enter row: ");
        int rows = sc.nextInt();
        System.out.println("Enter columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter no. you want to search: ");
        int num = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == num) {
                    System.out.println("[" + i + "]" + "[" + j + "]");
                }
            }
        }

    }

    public static void spiralOrderMatrix(Scanner sc) {
        System.out.println("Enter row: ");
        int rows = sc.nextInt();
        System.out.println("Enter columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        // getting input from user
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // printing matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // display output in spiral order matrix
        System.out.println("The Spiral Order Matrix is: ");

        int rowStart = 0;
        int rowEnd = rows - 1;
        int colStart = 0;
        int colEnd = cols - 1;

        // To print spiral order matrix
        while (rowStart <= rowEnd && colStart <= colEnd) {

            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }

            rowStart++;

            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }

            colEnd--;

            for (int col = colEnd; col >= colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }

            rowEnd--;

            for (int row = rowEnd; row >= rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }

            colStart++;
        }

    }

    public static void transposeMatrix(Scanner sc) {
        System.out.println("Enter row: ");
        int rows = sc.nextInt();
        System.out.println("Enter columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Array after transposed");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // twoDArrayDemo(sc);

        // Searching for an element x in a matrix.
        // searchEleInMatrix(sc);

        // Home Work
        // https://docs.google.com/document/d/1XkI6549bd-qDvcUC88WuOW0ISPfrtm-Tk06pt_I-89I/edit?tab=t.0
        // spiralOrderMatrix(sc);

        transposeMatrix(sc);
    }
}
