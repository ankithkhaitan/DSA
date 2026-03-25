import java.util.*;

public class SummedSubsequence {

    public static void printSubsequence(int index, int[] arr, int sum, int s, int n, List<Integer> ds) {

        // Base case
        if (index == n) {
            if (s == sum) {
                for (int x : ds) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            return;
        }

        // Pick the element
        ds.add(arr[index]);
        s += arr[index];

        printSubsequence(index + 1, arr, sum, s, n, ds);

        // Backtrack
        s -= arr[index];
        ds.remove(ds.size() - 1);

        // Not pick
        printSubsequence(index + 1, arr, sum, s, n, ds);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 5, 4};
        int n = arr.length;
        int sum = 6;

        List<Integer> ds = new ArrayList<>();

        printSubsequence(0, arr, sum, 0, n, ds);
    }
}