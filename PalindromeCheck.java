public class PalindromeCheck {
    public static boolean isPalindrome(String str, int start, int end) {
        if(start >= end) {
            return true;
        }

        if(str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str = "RADAR";

        boolean result = isPalindrome(str, 0, str.length() - 1);

        if(result) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}