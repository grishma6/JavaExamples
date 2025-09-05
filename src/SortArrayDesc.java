import java.util.Arrays;
import java.util.Collections;

public class SortArrayDesc {
    public static void main(String[] args) {
        int[] num = {8, 9, 5, 7, 3, 2};

        //Arrays.sort(num, Collections.reverseOrder());

        //System.out.println("Sorting the Array in Descending Order: " + Arrays.toString(num));

        int n = num.length;

        Arrays.sort(num);
        for(int i=0; i<n/2; i++){
            int temp = num[i];
            num[i] = num[n-i-1];
            num[n-i-1] = temp;
        }
            System.out.println("Sorting the Array in Descending Order: " + Arrays.toString(num));
        }
    }
