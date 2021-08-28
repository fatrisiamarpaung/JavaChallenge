import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int N, firstNumber, secondNumber;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input: ");
        N = scan.nextInt();
        firstNumber = scan.nextInt();
        secondNumber = scan.nextInt();
    }

    static void printFibonacci(int N, int firstNumber, int secondNumber){
        int nextNumber=0;

        if (N>2){
            System.out.print(firstNumber + "," + secondNumber );

            for (int i=2; i<N; i++){
                nextNumber = firstNumber+secondNumber;
                System.out.print("," + nextNumber);
                firstNumber = secondNumber;
                secondNumber = nextNumber;
            }
        } else {
            System.out.println("N must greater than 2");
        }
    }
}



