import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String word = "";

        Scanner scan = new Scanner(System.in);
        System.out.print("Input: ");
        word = scan.nextLine();

        isPalindrome(word);
    }

    static void isPalindrome(String word){

        int wordLength;
        String wordReversed = "";

        wordLength = word.length()-1;
        for (int i = 1; i <= word.length(); i++) {
            wordReversed = wordReversed + word.charAt(wordLength);
            wordLength--;
        }

        if (word.equals(wordReversed)){
            System.out.println(word+ " is Palindrome");
        } else if (!word.equals(wordReversed)){
            System.out.println(word+" is not Palindrome");
        }
    }
}
