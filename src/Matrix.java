import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {

        int row, col, i, j;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Row Number:");
        row = scanner.nextInt();

        System.out.println("Input Column Number: ");
        col = scanner.nextInt();

        int[][] firstMatrix = new int[row][col];
        int[][] secondMatrix = new int[row][col];

        System.out.println("Input Matrix 1:");
        for (i=0; i<row; i++){
            for (j=0; j<col; j++){
                firstMatrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Input Matrix 2:");
        for (i=0; i<row; i++){
            for (j=0; j<col; j++){
                secondMatrix[i][j] = scanner.nextInt();
            }
        }

        int resultMatrix[][];
        resultMatrix = sumMatrix(row, col, firstMatrix, secondMatrix);
        printMatrix(resultMatrix, row, col);
    }

    static int[][] sumMatrix(int row, int col, int[][] firstMatrix, int[][] secondMatrix) {

        int i, j = 0;

        int[][] newMatrix = new int[row][col];

        for (i=0; i<row; i++){
            for (j=0; j<col; j++){
                newMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        return newMatrix;
    }

    static void printMatrix(int[][] matrix, int row, int col){
        int i, j;
        System.out.println("Sum of two matrices is: ");

        for (i=0; i<row; i++){
            for (j=0; j<col; j++){
                System.out.print(+(matrix[i][j])+" ");
            }
            System.out.println();
        }
    }
}

