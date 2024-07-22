package leetCode;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{3, 4, 5}, new int[]{1, 2, 6}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            nums[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            nums[nums1.length + i] = nums2[i];
        }

        int length = nums.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int n = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = n;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        if (length % 2 == 0) return (nums[(length/2) - 1] + nums[length/2]) / 2d;
        else return nums[((length + 1) / 2) - 1];
    }
}
