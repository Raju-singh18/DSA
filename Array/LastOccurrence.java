public class LastOccurrence {

    public static int findLast(int[] arr, int target) {

        // Write your code here
        int n = arr.length;

        for(int i=n-1; i>=0; i--){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40};
        int target = 20;

        System.out.println(findLast(arr, target));
    }
}