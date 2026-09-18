import java.util.Arrays;

public class MoveZeros {

    public static void moveZeros(int[] arr) {

        // ! Write your code here
        int i=-1;
        for(int j=0; j<arr.length; j++){
        if(arr[j] == 0){
        i=j;
        break;
        }
        }

        for(int k=i+1; k<arr.length; k++){
        if(arr[k] !=0){
        arr[i]=arr[k];
        arr[k]=0;
        i++;
        }
        }

    }

    public static void main(String[] args) {

        int[] arr = { 0, 1, 0, 3, 12 };

        moveZeros(arr);

        System.out.println(Arrays.toString(arr));
    }
}
