import java.util.*;

public class FirstDuplicateWord {
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        input = scanner.nextLine();

        String duplicates = duplicateWord(input);
        System.out.println(duplicates);
    }

   static String duplicateWord(String input){

        String[] words = input.split(" ");
        Map<String, Integer> duplicateWord = new HashMap();

        for (var i=0; i< words.length; i++){
            if (duplicateWord.containsKey(words[i])){
                duplicateWord.put(words[i], duplicateWord.get(words[i]) + 1);
            } else{
                duplicateWord.put(words[i], 1);
            }
        }

        for (var i=0; i< words.length; i++){
            if (duplicateWord.get(words[i]) > 1){
                return words[i];
            }
        }

        return "No Repetition";
    }
}


