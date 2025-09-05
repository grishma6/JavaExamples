import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a String: ");
            String str = scanner.nextLine();

            String reverse = "";

            for(int i=str.length()-1; i>=0; i--){
                reverse+=str.charAt(i);
            }

            if(str.equals(reverse)){
                System.out.println("The element entered is a palindrome");
            }
            else{
                System.out.println("It is not a palindrome");
            }
            scanner.close();
    }
}
