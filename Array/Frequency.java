public class Frequency {

    public static int findFrequency(int[] arr, int target) {

        // Write your code here
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;

        System.out.println(findFrequency(arr, target));
    }
}