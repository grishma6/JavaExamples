import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scanner.nextLine();

        String noSpaces = str.replace(" ", "");

        System.out.println("The string without whitespaces is " + noSpaces);
        scanner.close();
    }
}
