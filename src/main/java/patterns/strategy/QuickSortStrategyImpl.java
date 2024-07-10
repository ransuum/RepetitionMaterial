package patterns.strategy;

import java.util.Arrays;

public class QuickSortStrategyImpl implements SortStrategy{
    @Override
    public void sort(int[] nums) {
        Arrays.sort(nums);
    }
}
