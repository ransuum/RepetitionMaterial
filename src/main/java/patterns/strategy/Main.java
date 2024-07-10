package patterns.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }

        SortContext sortContext = new SortContext(new BubbleSortStrategyImpl());
        sortContext.sort(nums);
        System.out.println("Bubble Sorted Array: " + Arrays.toString(nums));

        SortContext sortContext1 = new SortContext(new QuickSortStrategyImpl());
        sortContext1.sort(nums);
        System.out.println("Quick Sorted Array: " + Arrays.toString(nums));
    }
}
