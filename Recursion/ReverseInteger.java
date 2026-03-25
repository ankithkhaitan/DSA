public class ReverseInteger {
    public static int reverse(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int rev) {
        if (n == 0 ) {
            return rev;
        }
        rev = rev * 10 + (n%10);
        return helper(n/10, rev);
    }

    public static void main(String[] args) {
        int num = 12345;
        int result = reverse(num);
        System.out.println("Reversed number is: " + result);

    }
}