import java.util.*;

class A2PermutationOfArray {

    private void recurPermute(int index, int[] nums, List<List<Integer>> ans) {

        if (index == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(ds);
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            recurPermute(index + 1, nums, ans);
            swap(i, index, nums); // backtrack
        }
    }

    private void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recurPermute(0, nums, ans);
        return ans;
    }

    // ✅ Main method to test
    public static void main(String[] args) {
        A2PermutationOfArray obj = new A2PermutationOfArray();
        int[] nums = {1, 2, 3};

        List<List<Integer>> result = obj.permute(nums);

        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }
}