public class ArraySum {

    public static int findSum(int[] arr) {

        // Write your code here
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 15};

        System.out.println(findSum(arr));
    }
}