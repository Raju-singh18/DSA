public class EvenOddCount {

    public static void countEvenOdd(int[] arr) {

        // Write your code here
        int even=0;
        int odd = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                even+=1;
            }else{
                odd +=1;
            }
        }

        System.out.println("Even Number: "+ even);
        System.out.println("Odd Number: "+ odd);

    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 15, 7};

        countEvenOdd(arr);
    }
}