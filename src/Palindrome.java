import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String word = "", hasil;

        Scanner scan = new Scanner(System.in);
        System.out.print("Input: ");
        word = scan.nextLine();

        hasil = Check(word);

        if (word.equals(hasil)){
            System.out.println(hasil+ " is Palindrome");
        } else if (!word.equals(hasil)){
            System.out.println(hasil+" is not Palindrome");
        }
    }


    static String Check(String word){
        int jumlah, jumlahHuruf;
        String result = "";

       jumlah = word.length();
       jumlahHuruf = jumlah-1;

        for (int i = 0; i < jumlah; i++) {
        result = result + word.charAt(jumlahHuruf);
        jumlahHuruf--;
        }

        return result;
    }
}
