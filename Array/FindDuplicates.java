public class FindDuplicates {

    public static void findDuplicates(int[] arr) {

        int n = arr.length;
        boolean[] visited = new boolean[n];
        boolean foundDuplicate = false;

        for (int i = 0; i < n; i++) {

            if (visited[i]) {
                continue;
            }

            int target = arr[i];
            int count = 1;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] == target) {
                    visited[j] = true;
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(target);
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            System.out.println("No Duplicates");
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 10, 40};

        findDuplicates(arr);
    }
}