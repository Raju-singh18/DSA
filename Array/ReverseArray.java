import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] arr) {

        // Write your code here
        int i=0; 
        int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
            i++;
            j--;
        }

    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }
}