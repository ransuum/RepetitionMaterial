package leetCode;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        String[] array = String.valueOf(x).split("");
        StringBuilder reverse = new StringBuilder();

        for (int i = array.length - 1; i >= 0 ; i--) {
            reverse.append(array[i]);
        }

        return String.valueOf(x).contentEquals(reverse);
    }
}
