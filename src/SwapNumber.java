import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        int input1,input2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter input 1: ");
        input1=scan.nextInt();
        System.out.print("Enter input 2: ");
        input2=scan.nextInt();

        int result[] = Swap(input1,input2);
        System.out.println("Input 1: before "+input1+", after "+result[0]);
        System.out.println("Input 2: before "+input2+", after "+result[1]);

    }

    public static int[] Swap(int number1, int number2){
        int temp;

        temp=number1;
        number1=number2;
        number2=temp;

        return new int[] {number1, number2};


    }
}
