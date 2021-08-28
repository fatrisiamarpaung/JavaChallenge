import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        int number, power ;

        Scanner scan = new Scanner(System.in);
        System.out.print("Input:");
        number = scan.nextInt();
        power = scan.nextInt();

        System.out.println("Result " + Power(number, power));
    }

    static int Power(int number, int power){
        int result = 1, i;

        for ( i = 0; i < power; i++ ){
            result = result * number;
        }
        return result;
    }
}
