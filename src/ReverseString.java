import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scanner.nextLine();

        String reverse = "";
        for(int i=str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);
        }
        System.out.println("The reversed String: " + reverse);
        scanner.close();
    }
}
