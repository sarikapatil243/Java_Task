import java.lang.*;
public class Q1_2_ReverseWords {
    public static void main(String[] args) {
        String input = "Hello World";
        String reversedWords = reverseWords(input);
        System.out.println(reversedWords); // Output: 'olleH dlroW'
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        return result.toString().trim();
    }
}

