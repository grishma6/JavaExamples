import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the digits: ");
        int num = scanner.nextInt();

        int sum = 0;
        int temp = num;

        for(int i = 0; i <= num; i++){
            int digit = temp%10;
            sum+=digit;
            temp = temp/10;
        }
        System.out.print("The sum of total digits in a"  + num + "is: "+ sum);




        scanner.close();
    }
}
