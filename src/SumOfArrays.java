public class SumOfArrays {
    public static void main(String[] args){
        int[] num = {9,8,3,4,5};
        int sum = 0;

        for(int i=0;i<num.length;i++){
            sum+=num[i];
        }
        System.out.println("The sum of elements in an array: " + sum);
    }
}
