
import java.util.TreeSet;

public class ArrayUnion {

    public static void findUnion(int[] arr1, int[] arr2) {

        // Write your code here
        int n=arr1.length;
        int m=arr2.length;
        TreeSet<Integer> st  = new TreeSet<>();
        for(int i=0; i< arr1.length; i++){
            st.add(arr1[i]);
        }

        for(int j=0; j<m; j++){
            st.add( arr2[j]);
        }

        for(int ele: st){
            System.out.print(ele+ " ");
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        findUnion(arr1, arr2);
    }
}