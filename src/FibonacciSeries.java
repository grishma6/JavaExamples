import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the term: ");
        int n = scanner.nextInt();

        int a = 0; int b = 1;

        System.out.print("The fibonacci series: ");
        for(int i = 1; i <= n; i++){
            System.out.print( a + " ");
            int next = a + b;
            a = b;
            b = next;
        }


        scanner.close();
    }
}
