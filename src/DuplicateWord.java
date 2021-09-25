import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWord {
    public static void main(String[] args) {

        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        input = scanner.nextLine();

        Set<String> duplicates = DuplicateWord(input);
        System.out.println(duplicates);
    }

    public static Set<String> DuplicateWord(String input){

        Set<String> duplicate = new LinkedHashSet<>();
        String[] words = input.split("\\s+");
        Set<String> set = new LinkedHashSet<>();

        if(input==null || input.isEmpty()){
            System.out.println("Input is null");
        }

        for(var word : words){
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
