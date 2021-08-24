import java.util.Scanner;

public class SegitigaPascal {
    public static void main(String[] args) {

        int i, j, k;
        int x = 1;

        for (i=0 ; i<=5; i++){ //main loop

            for (k=0; k<5-i; k++){ //utk print spasi
                System.out.print(" ");
            }

            for (j=0; j<=i; j++){ //bikin output nilai 1 di segitiga

                if (j==0 || i==0) { //bikin kondisi untuk print 1 ke output
                    System.out.print(x+"  ");
                }
                else {
                    x = x * (i-j+1) / j;
                    System.out.print(x +"  ");
                }

            }
//nilai x berubah
//            i = 3
//            xxxxx1
//                    xxxx11
//            xxx121
//            xx1331

            System.out.println();
        }
    }
}

