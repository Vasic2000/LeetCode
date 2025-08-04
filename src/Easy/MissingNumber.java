package Easy;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int [] nums1 = {3,0,1};
        int [] nums2 = {0,1};
        int [] nums3 = {9,6,4,2,3,5,7,0,1};
        int [] nums4 = {1,6,4,2,3,5,7,0,8};
        int [] nums5 = {1,6,4,2,9,12,3,5,13,7,0,10,8};
        int [] nums6 = {1,6,4,2,9,12,3,5,13,7,11,0,10,8};
        int [] nums7 = {1,6,4,2,9,12,3,5,13,7,11,14,10,8};

        System.out.println(missingNumber(nums1));
        System.out.println(missingNumber(nums2));
        System.out.println(missingNumber(nums3));
        System.out.println(missingNumber(nums4));
        System.out.println(missingNumber(nums5));
        System.out.println(missingNumber(nums6));
        System.out.println(missingNumber(nums7));

    }

    private static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        if(nums[0] != 0) return 0;
        while(i < nums.length - 1) {
            if((nums[i+1] - nums[i]) !=1)
                return i+1;
            i++;
        }
        return i+1;
    }
}
