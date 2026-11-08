package arraysandstrings;
import java.util.Scanner;
public class CountVowels {
    public static void main(String[] args) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        word = word.toLowerCase();
        int count = 0;
        for(int i = 0; i<word.length(); i++){
            for (int j = 0; j<vowels.length; j++) {
                if (word.charAt(i) == vowels[j].charAt(0)) {
                    count++;
                }
            }
        }
        System.out.println("Vowel count is: "+ count);
        input.close();
    }
}
