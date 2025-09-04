import java.util.Scanner;

public class ProductofDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int num = scanner.nextInt();

        int temp = num;
        int product = 1;
        while(temp != 0){
            int digit = temp%10;
            product*=digit;
            temp = temp/10;
        }
        System.out.println("The product of digits " + num + ": " + product);

        scanner.close();
    }
}
