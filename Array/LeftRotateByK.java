import java.util.Arrays;

public class LeftRotateByK {

    public static void reverse(int[]arr, int start, int end){
        int i=start;
        int j=end;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        if(k==n){
            return;
        }else{
            k=k%n;
        }
        // Write your code here
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        rotate(arr, k);
        String arr1 = Arrays.toString(arr);
        // System.out.println(Arrays.toString(arr));
        System.out.println(arr1);
    }
}