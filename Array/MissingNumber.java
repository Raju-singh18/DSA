public class MissingNumber {

    public static int findMissing(int[] arr) {

        // Write your code here

        int n = arr.length;
        int sum=0;
        int naturalSum = (int)(n*(n+1))/2;
        for(int i=0; i<n; i++){
            sum +=arr[i];
        }
        return naturalSum-sum;
    }

    public static void main(String[] args) {

        int[] arr = {3, 0, 1};

        System.out.println(findMissing(arr));
    }
}