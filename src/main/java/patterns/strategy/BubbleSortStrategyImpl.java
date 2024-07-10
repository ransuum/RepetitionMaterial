package patterns.strategy;

public class BubbleSortStrategyImpl implements SortStrategy{
    @Override
    public void sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (nums[j] > nums[j+1]) {
                    int t = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = t;
                }
            }
        }
    }
}
