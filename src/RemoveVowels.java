import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scanner.nextLine();

        String noVowels = str.replaceAll("[aeiouAEIOU]", "");

        System.out.println("The element without vowel is " + noVowels);
        scanner.close();
    }
}