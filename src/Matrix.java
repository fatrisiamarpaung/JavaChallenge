public class Matrix {

    public static void main(String[] args) {
        Sum();
    }

    public static int[][] Sum() {
        int i, j = 0;
        int[][] firstMatrix = {{2,3,4}, {5,2,3}};
        int[][] secondMatrix = {{-4,5,3},{5,6,3}};
        int[][] sumMatrix = new int[2][3];

        for (i=0; i<2; i++){
            for (j=0; j<3; j++){
                sumMatrix[i][j] =firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        System.out.println("Sum of two matrices is: ");

        for (i=0; i<2; i++){
            for (j=0; j<3; j++){
                System.out.print(+(sumMatrix[i][j])+" ");
            }
            System.out.println();
        }

        return sumMatrix;
    }
}
