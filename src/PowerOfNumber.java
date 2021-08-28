import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        int hasil, nilai, pangkat ;

        Scanner scan = new Scanner(System.in);
        System.out.print("Input:");
        nilai = scan.nextInt();
        pangkat = scan.nextInt();

        hasil = Pangkat(nilai, pangkat);
        System.out.println(hasil);


    }

    static int Pangkat(int angka, int pangkat){
        int hasil = (int) Math.pow(angka, pangkat);

        return hasil;
    }
}
