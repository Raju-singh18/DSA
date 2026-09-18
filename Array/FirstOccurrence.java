public class FirstOccurrence {

    public static int findFirst(int[] arr, int target) {

        // Write your code here
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40};
        int target = 20;

        System.out.println(findFirst(arr, target));
    }
}