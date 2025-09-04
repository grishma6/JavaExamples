import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int original = num;
        int reverse = 0;

        int digit;
        while(original != 0){
            digit = original%10;
            reverse = reverse*10 + digit;
            original = original/10;
        }

        if(num == reverse){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }


        scanner.close();
    }
}
