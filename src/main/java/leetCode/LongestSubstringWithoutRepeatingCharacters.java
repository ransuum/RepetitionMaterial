package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;

        List<Integer> integerList = new ArrayList<>();

        String[] strings = s.split("");
        String some = strings[0];
        StringBuilder substring = new StringBuilder();
        substring.append(some);
        for (int i = 1; i < strings.length; i++) {
            if (!strings[i].equals(some)){
                some = strings[i];
                substring.append(strings[i]);
                System.out.println(substring);
            }  else {
                some = strings[i];
                integerList.add(substring.length());
                substring = new StringBuilder();
                substring.append(some);
            }
        }
        System.out.println(substring);
        System.out.println(integerList);
        return integerList.size();
    }
}
