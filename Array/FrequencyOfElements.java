public class FrequencyOfElements {

    static int count=0;

    public static void printFrequency(int[] arr) {

           // Write your code here
        int n=arr.length;
        boolean []visited = new boolean[n];

        for(int i=0; i<n; i++){
            int target = arr[i];
            if(visited[i] == true){
                continue;
            }else{
               count++; 
               visited[i]=true;
            }
             
            for(int j=i+1; j<n; j++){
                if(arr[j] == target){
                    visited[j]=true;
                    count++;
                }
            }

            System.out.println(arr[i]+"-->"+ count);
            count=0;
        }

    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 10};

        printFrequency(arr);
    }
}