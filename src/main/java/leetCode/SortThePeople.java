package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class SortThePeople {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortPeople(new String[]{"Mary", "Emma", "John"}, new int[]{180, 165, 170})));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String > map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        int index = heights.length;
        for (int i = 0; i < index - 1; i++) {
            for (int j = 0; j < index - i - 1; j++) {
                if (heights[j] > heights[j + 1]) {
                    int t = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = t;
                }
            }
        }

        String[] result = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            result[i] = map.get(heights[names.length - i - 1]);
        }
        return result;
    }
}
