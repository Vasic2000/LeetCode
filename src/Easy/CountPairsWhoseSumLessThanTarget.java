package Easy;

//TASK.2824
//Given a 0-indexed integer array nums of length n and an integer target,
// return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.

import java.util.ArrayList;
import java.util.List;

public class CountPairsWhoseSumLessThanTarget {
    public static void main(String[] args) {
        List nums1 = new ArrayList<>();
        nums1.add(-1);
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        nums1.add(1);

        int target1 = 2;


        List nums2 = new ArrayList<>();
        nums2.add(-6);
        nums2.add(2);
        nums2.add(5);
        nums2.add(-2);
        nums2.add(-7);
        nums2.add(-1);
        nums2.add(3);

        int target2 = -2;


        List nums3 = new ArrayList<>();
        nums3.add(-7);
        nums3.add(8);
        nums3.add(8);
        nums3.add(-9);
        nums3.add(-9);
        nums3.add(-12);
        nums3.add(4);
        nums3.add(1);
        nums3.add(2);
        nums3.add(0);
        nums3.add(9);
        nums3.add(19);
        nums3.add(-2);
        nums3.add(6);

        int target3 = -5;

        System.out.println(countPairs(nums1, target1));
        System.out.println(countPairs(nums2, target2));
        System.out.println(countPairs(nums3, target3));
    }

    public static int countPairs(List<Integer> nums, int target) {
        int result = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if(nums.get(i) + nums.get(j) < target) result++;
            }
        }
        return result;
    }

}
