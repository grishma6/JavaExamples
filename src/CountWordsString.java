import java.util.Scanner;

public class CountWordsString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scanner.nextLine();

        String[] words = str.trim().split("\\s+");
        int wordCount = words.length;

        System.out.println("The number of words: " + wordCount);
    }
}
