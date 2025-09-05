public class LargestElement {
    public static void main(String[] args) {

        int[] numbers = {55, 68, 97, 45, 107};
        int largest = numbers[0];

        for(int i=0; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        System.out.println("The largest number in an array is " + largest);
    }
}
