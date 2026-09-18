public class MinimumElement {

    public static int findMin(int[] arr) {

        // Write your code here
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 15};

        System.out.println(findMin(arr));
    }
}