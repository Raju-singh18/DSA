public class CheckArrayEqual {

    public static boolean areEqual(int[] arr1, int[] arr2) {

        // Write your code here
        int n = arr1.length;
        int m = arr2.length;
        if (n != m) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};

        // int[] arr1 = { 1, 2, 3 };
        // int[] arr2 = { 1, 2 };

        if (areEqual(arr1, arr2)) {
            System.out.println("Arrays are Equal");
        } else {
            System.out.println("Arrays are Not Equal");
        }
    }
}
