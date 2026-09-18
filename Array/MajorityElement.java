public class MajorityElement {

    public static int findMajority(int[] arr) {

        // Write your code here
        int n = arr.length;
        int m = (int)n/2;
        int count =1;

         
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > m){
                return arr[i];
            }
            count = 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {3, 3, 4, 2, 3, 3, 3};

        System.out.println(findMajority(arr));
    }
}
