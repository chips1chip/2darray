import java.util.Scanner;  // Importing Scanner class for user input

public class AddSubtract2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner object for taking input
        
        // Taking input for number of rows and columns
        System.out.println("Enter no. of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter no. of columns: ");
        int columns = sc.nextInt();
        
        int[][] firstMatrix = new int[rows][columns];  // 2D array for first matrix
        int[][] secondMatrix = new int[rows][columns];  // 2D array for second matrix
        
        // Input elements into first matrix
        System.out.println("Enter elements into first matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                firstMatrix[i][j] = sc.nextInt();
            }
        }
        
        // Input elements into second matrix
        System.out.println("Enter elements into second matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                secondMatrix[i][j] = sc.nextInt();
            }
        }

        // Matrix addition
        int[][] sumMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Matrix subtraction
        int[][] diffMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                diffMatrix[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
            }
        }

        // Display first matrix
        System.out.println("Elements in first matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Display second matrix
        System.out.println("Elements in second matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(secondMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Display sum of two matrices
        System.out.println("Sum of two matrices: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Display subtraction of two matrices
        System.out.println("Subtraction of two matrices: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(diffMatrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();  // Closing the scanner object
    }
}
