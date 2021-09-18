import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWordInString {
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        input = scanner.nextLine();

        Set<String> duplicates = duplicateWord(input);
        System.out.println(duplicates);

    }

    public static Set<String> duplicateWord(String input){

        Set<String> duplicate = new HashSet<>();
        String[] words = input.split("\\s+");
        Set<String> set = new HashSet<>();

        if(input==null || input.isEmpty()){
            return Collections.emptySet();
        }

        for (var word : words){
            if (!set.add(word)){
                duplicate.add(word);
            }
        }

        if (duplicate.isEmpty()){
            duplicate.add("No Repetition");
        }

        return duplicate;
    }
}
