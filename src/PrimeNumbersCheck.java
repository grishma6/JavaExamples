import java.util.Scanner;

public class PrimeNumbersCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        boolean isPrime = true;


        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
            if (isPrime) {
                System.out.println("The number is a prime number");
            } else {
                System.out.println("The number is NOT a Prime number");
            }
            scanner.close();
        }
    }
