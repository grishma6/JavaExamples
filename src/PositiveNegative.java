import java.util.Scanner;

public class PositiveNegative {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = scanner.nextInt();

        /* if(a > 0){
            System.out.println("The number is POSITIVE");
        }
        else if(a < 0){
            System.out.println("The number is NEGATIVE");
        }
        else{
            System.out.println("The number is ZERO ");
        }


        scanner.close(); */


        String result = (x > 0) ? "Positive" : (x < 0) ? "Negative" : "Zero";
        System.out.print("The number is " + result);
    }
}
