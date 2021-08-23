import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class CapitalReverse {
    public static void main(String[] args) {
        String[] result =new String[10];
        String word, reversedWord;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan Kata: ");
        word = scan.nextLine();

        reversedWord = Reverse(word);
        for (int i = 0; i < reversedWord.length(); i++) {

            if (reversedWord.charAt(i) == 'a' || reversedWord.charAt(i) == 'i' || reversedWord.charAt(i) == 'u' || reversedWord.charAt(i) == 'e' || reversedWord.charAt(i) == 'o'){
                result[i] = String.valueOf(Character.toUpperCase(reversedWord.charAt(i)));
            } else {
                result[i] = String.valueOf(reversedWord.charAt(i));
            }

        }
        System.out.println(Arrays.toString(result));
    }

    public static String Reverse (String word){
        String hasil ="";
        int jumlah = word.length();
        int  jumlahHuruf = jumlah-1;

        for (int i = 0; i < jumlah; i++) {
            hasil = hasil + word.charAt(jumlahHuruf);
            jumlahHuruf--;
        }
        return hasil;
    }
}


// cara lain
//            if (reversedWord.charAt(i) == 'a' || reversedWord.charAt(i) == 'i' || reversedWord.charAt(i) == 'u' || reversedWord.charAt(i) == 'e' || reversedWord.charAt(i) == 'o'){
//                System.out.print(Character.toUpperCase(reversedWord.charAt(i)));
//            } else {
//                System.out.print(reversedWord.charAt(i));
//            }