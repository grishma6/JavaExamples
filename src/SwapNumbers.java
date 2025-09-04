import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int y = scanner.nextInt();
        int temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("After swapping the variables are: " + x + " " +y);

        scanner.close();


    }
}
