import java.util.Arrays;

public class RightRotate {

    public static void rotate(int[] arr) {

        // Write your code here
        int n = arr.length;
        int temp = arr[n-1];
        for(int i=n-2; i>=0; i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp;

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        rotate(arr);

        System.out.println(Arrays.toString(arr));
    }
}