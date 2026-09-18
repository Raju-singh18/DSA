public class NumberCount {

    public static void countNumbers(int[] arr) {

        // Write your code here
        int n = arr.length;
        int pos=0;
        int neg = 0;
        int zero = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                pos++;
            }else if(arr[i]<0){
                neg++;
            }else{
                zero++;
            }
        }

        System.out.println("Postive Number Count: "+ pos);
        System.out.println("Negative Number Count: "+ neg);
        System.out.println("Zero Number Count: "+ zero);
    }

    public static void main(String[] args) {

        int[] arr = {10, -5, 0, 8, -2, 0, 15};

        countNumbers(arr);
    }
}