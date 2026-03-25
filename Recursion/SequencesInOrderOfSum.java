import java.util.*;

public class SequencesInOrderOfSum {

    static List<Pair> result = new ArrayList<>();

    public static void printSeq(int index, int arr[], int sum, int n, List<Integer> ds) {

        if (index == n) {
            result.add(new Pair(ds, sum));
            return;
        }

        // take
        ds.add(arr[index]);
        printSeq(index + 1, arr, sum + arr[index], n, ds);

        // not take
        ds.remove(ds.size() - 1);
        printSeq(index + 1, arr, sum, n, ds);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1};
        int n = arr.length;

        printSeq(0, arr, 0, n, new ArrayList<>());

        // Sort by sum
        Collections.sort(result, (a, b) -> a.sum - b.sum);

        // Print in [ ] format
        for (Pair p : result) {
            System.out.println(p.seq);
        }
    }
}

class Pair {
    List<Integer> seq;
    int sum;

    Pair(List<Integer> seq, int sum) {
        this.seq = new ArrayList<>(seq);
        this.sum = sum;
    }
}