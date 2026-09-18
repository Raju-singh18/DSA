import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr) {
 
       int i=0;
       int j;
       for(j=0; j<arr.length-1; j++){
        if(arr[j]!= arr[j+1]){
            i++;
            arr[i]=arr[j+1];
        } 
       }

       return i+1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4};

        int k = removeDuplicates(arr);

        System.out.println("Unique count: " + k);

        System.out.println(
            Arrays.toString(Arrays.copyOf(arr, k))
        );
    }
}