package com.master.twonumsum;

import java.util.HashMap;

public class TwoSumDemo2 {

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 17;
        int[] indexs = twoNumSum2(nums, target);
        for (int i = 0; i < indexs.length; i++) {
            System.out.println(indexs[i]);
        }
    }

    private static int[] twoNumSum2(int[] nums, int target) {
        //一层循环嵌套，复杂度是O(N)
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int partnerNum = target - nums[i];
            if (map.containsKey(partnerNum)) {
                return new int[]{map.get(partnerNum),i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
