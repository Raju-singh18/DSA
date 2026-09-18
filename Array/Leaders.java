public class Leaders {
    static boolean isLeader = true;

    public static void findLeaders(int[] arr) {

        // Write your code here
         
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j]>=arr[i]){
                    isLeader = false;
                    break;
                }else{
                    isLeader=true;
                }
            }

            if(isLeader){
                System.out.print(arr[i]+" ");
            }
            isLeader=true;
        }

    }

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};

        findLeaders(arr);
    }
}
