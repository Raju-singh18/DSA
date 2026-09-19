public class TrappingRainWater {
    public static int trappedWater(int []arr){
       int n = arr.length;
       int leftMax[] = new int[n];
       int rightmax[] = new int[n];
       int water=0;
       leftMax[0]=arr[0];
       rightmax[n-1]=arr[n-1];

       for(int i=1; i<n; i++){
         leftMax[i] = Math.max(arr[i],leftMax[i-1]);
       }

       for(int j=n-2; j>=0; j--){
          rightmax[j] = Math.max(rightmax[j+1],arr[j]);
       }

       for(int i=0; i<n; i++){
          int height = Math.min(leftMax[i], rightmax[i]) - arr[i];
          water += height*1;
       }

       return water;

    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,3,2,5};
        System.out.println("Trapped water: "+ trappedWater(arr));
    }
}
