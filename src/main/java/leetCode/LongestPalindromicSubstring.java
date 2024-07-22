package leetCode;

public class LongestPalindromicSubstring {                           //BABAD
    public static void main(String[] args) {                         //DABAB
        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";

        String[] word = s.split("");
        String s2 = "";
        String longest = "";

        for (int i = word.length - 1; i >= 0 ; i--) {
            s2 += word[i];
        }

        for (int i = 0; i < word.length; i++) {
            for (int j = i + 1; j <= word.length; j++) {
                String sub = s.substring(i, j);
                if (sub.equals(s2) && sub.length() > longest.length()){
                    longest = sub;
                }
            }
        }
        return longest;
    }
}
