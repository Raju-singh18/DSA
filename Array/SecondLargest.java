public class SecondLargest {

    public static int findSecondLargest(int[] arr) {

        // Write your code here
        int first = arr[0];
        int second =Integer.MIN_VALUE;

        for(int i=1; i< arr.length; i++){
            if(arr[i]>first){
                second = first;
                first=arr[i];
            }else if(arr[i]<first && arr[i]>second){
                second = arr[i];
            }
        }

        return second;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 15};

        System.out.println(findSecondLargest(arr));
    }
}