public class SmallestElement {
    public static void main(String[] args){
        int[] num = {90,54,36,38,65};
        int smallest = num[0];

        for(int i=0;i<num.length;i++){
            if(num[i] < smallest){
                smallest = num[i];
            }
        }
        System.out.println("The smallest element in an array is " + smallest);
    }
}
