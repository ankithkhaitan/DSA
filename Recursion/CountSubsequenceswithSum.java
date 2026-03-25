import java.util.*;

public class CountSubsequenceswithSum {
    public static int printS(int index, int s, int sum, int arr[], int n) {

        if(index == n) {
            if(s == sum) return 1;
            else return 0;
        }

        s += arr[index];
        int l = printS(index + 1, s, sum, arr, n);

        s -= arr[index];

        int r = printS(index + 1, s, sum, arr, n);

        return l + r;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 1, 5, 4};
        int n = arr.length;
        int sum = 15;

        int result = printS(0, 0, sum, arr, n);
        System.out.println(result);
    }
}