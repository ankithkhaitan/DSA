import java.util.*;

public class Subsequence {

    public static void printSubsequences(int arr[], int index, List<Integer> current) {
        if(index == arr.length) {
            System.out.println(current);
            return;
        }

        current.add(arr[index]);
        printSubsequences(arr, index + 1, current);

        current.remove(current.size() - 1);
        printSubsequences(arr, index + 1, current);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        printSubsequences(arr, 0, new ArrayList<>());
    }
}

