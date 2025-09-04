import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int digits = String.valueOf(num).length();
        int sum = 0;
        int original = num;

        while(original != 0){
            int digit = original%10;
            sum += Math.pow(digit, digits);
            original = original/10;
        }
        if(sum == num){
            System.out.println("The number is a Armstrong Number");
        }
        else{
            System.out.println("The number is NOT a Armstrong Number");
        }


        scanner.close();
    }
}
