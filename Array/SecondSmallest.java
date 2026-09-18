
public class SecondSmallest {

    public static void findSecondSmallest(int[] arr) {

        // Write your code here
        // int second = 0;
        // Arrays.sort(arr);
        // for(int i=0; i<arr.length-1; i++){
        // if(arr[i] != arr[i+1]){
        // second = arr[i+1];
        // System.out.println("Second Smallest: "+ second);
        // return;
        // }
        // }
        // System.out.println("No Second Smallest");

        // ! second
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        if(secondSmallest == Integer.MAX_VALUE){
            System.out.println("No Second Smallest");
        }else{
          System.out.println("Second Smallest: "+ secondSmallest);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 10, 5, 8, 10, 3, 5 };

        findSecondSmallest(arr);
    }
}
