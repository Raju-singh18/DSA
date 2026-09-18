public class MaxDifference {

    public static int findMaxDifference(int[] arr) {

        // Write your code here
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                max = Math.max(arr[j]-arr[i], max);
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};

        System.out.println(findMaxDifference(arr));
    }
}
