import java.util.Scanner;

public class PrimeNumbersRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first range of a prime numbers: ");
        int start = scanner.nextInt();

        System.out.print("Enter the second range of number: ");
        int end = scanner.nextInt();

        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if(num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
