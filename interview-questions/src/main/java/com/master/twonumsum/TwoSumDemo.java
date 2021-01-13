package com.master.twonumsum;

//暴力解法
public class TwoSumDemo {

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] indexs = twoNumSum(nums, target);
        for (int i = 0; i < indexs.length; i++) {
            System.out.println(indexs[i]);
        }
    }

    /**
     * 通过双重循环遍历数组中所有元素的两两组合，当出现符合的和时返回两个元素的下标
     * 这种两层循环嵌套，时间复杂度是O(N^2)，如果随着数组的增大的，这个算法的性能会下降
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoNumSum(int[] nums, int target) {
        //两层循环嵌套，复杂度是O(N^2)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
