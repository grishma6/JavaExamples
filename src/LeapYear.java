import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the new year: ");
        int leap = scanner.nextInt();

        if((leap%4 == 0 && leap%100 !=0) || (leap%400 == 0)){
            System.out.println("The year is a leap year");
        }
        else{
            System.out.println("The year is NOT a leap year");
        }

        scanner.close();
    }
}
