public class ArrayIntersection {

    public static void findIntersection(int[] arr1, int[] arr2) {

        // Write your code here
        int n = arr1.length;
        int m = arr2.length;
        boolean isFound = false;
        boolean isVisited[] = new boolean[m];

        for (int i = 0; i < n; i++) {               
            
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    if (isVisited[j] == true) {
                        continue;
                    } else {
                        System.out.println(arr1[i]);
                        isFound = true;
                        isVisited[j] = true;
                    }
                    for (int k = j + 1; k < m; k++) {
                        if (arr1[i] == arr2[k]) {
                            isVisited[k] = true;
                        }
                    }
                }
            }
        }
        if (!isFound) {
            System.out.println("No Common Elements");
        }
    }

    public static void main(String[] args) {

        // int[] arr1 = { 1, 2, 3, 4, 5 };
        // int[] arr2 = { 3, 4, 5, 6, 7 };

        // int[] arr1 = { 1, 2, 2, 3, 4, 5 };
        // int[] arr2 = { 2, 2, 4, 5, 5, 6 };

        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 4, 5, 6 };

        findIntersection(arr1, arr2);
    }
}
