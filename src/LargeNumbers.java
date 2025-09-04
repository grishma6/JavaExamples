import java.util.Scanner;

public class LargeNumbers {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        if(a>=b && a>=c){
            System.out.println("The greatest of three numbers is " + a);
        }
        else if(b>=a && b>=c){
            System.out.println("The greatest of three numbers is " + b);
        }
        else{
            System.out.println("The greatest of three numbers is " + c);
        }

        scanner.close();
    }
}
