public class MajorityElementOptimized {

    public static int findMajority(int[] arr) {

        // Write your code here
        int count = 0;
        int candidate=0;

        // find element
        for(int i=0; i<arr.length; i++){
            if(count == 0){
                candidate = arr[i];
                count=1;
            }else if(arr[i] == candidate){
                count++;
            }else{
                count--;
            }
        }

        // verify
        count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == candidate){
                count++;
            }
        }

        if(count > arr.length / 2){
            return candidate;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(findMajority(arr));
    }
}
