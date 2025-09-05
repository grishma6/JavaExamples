import java.util.Scanner;

public class VowelsConstants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scanner.nextLine();

        int vowels = 0;
        int constant = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    constant++;
                }
            }
        }
            System.out.print("The number of vowels: " + vowels);
            System.out.print("\nThe number of constants: " + constant);
        }
    }

