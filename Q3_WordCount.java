import java.util.Scanner;

public class Q3_WordCount {
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        int wordCount = countWords(input);
        System.out.println("words in the string: " + wordCount);
    }
}
