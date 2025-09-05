public class LinearSearch {
    public static void main(String[] args) {
        int[] num = {3, 6, 7, 8, 9};
        int target = 3;

        boolean found = false;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                System.out.println("The element is found: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The element is NOT found");
        }
    }
}
