import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int temp = num;
        int reverse = 0;

        while(temp != 0){
            int digit = temp % 10;
            reverse = reverse*10 + digit;
            temp = temp/10;
        }
        System.out.print("The reverse number of " + num + " is " + reverse);
        scanner.close();
    }
}
