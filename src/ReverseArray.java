public class ReverseArray {
    public static void main(String[] args){
        int[] num = {9,8,4,5,10};

        System.out.print("Original Array: ");
        for(int number : num){
            System.out.print(number + " ");
        }

        System.out.print("\nReverse Array: ");
        for(int i=num.length-1; i>=0; i--){
            System.out.print(num[i] + " ");
        }
    }
}
