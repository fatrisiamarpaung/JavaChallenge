import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int i;
        int[] number = {1, 2, 5, 6, 55};
        int max = 0;

        for ( i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }

        if (max %2 != 0){
            System.out.println(max + " adalah bilangan ganjil");
        } else {
            System.out.println(max + " adalah bilangan genap");
        }
    }
}
