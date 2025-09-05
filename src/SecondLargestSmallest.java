import java.util.Arrays;
public class SecondLargestSmallest {
    public static void main(String[] args){

        int[] num = {9,56,71,25}; //{

        Arrays.sort(num);

        System.out.println("The second smallest element in an array: " + num[1]);

        System.out.println("The second largest element in an array: " + num[num.length-2]);
    }
}
