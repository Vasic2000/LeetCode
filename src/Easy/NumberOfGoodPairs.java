package Easy;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1,1,3};
        int[] nums2 = {1,1,1,1};
        int[] nums3 = {1,2,3,4};
        System.out.println(numIdenticalPairs(nums1));
        System.out.println(numIdenticalPairs(nums2));
        System.out.println(numIdenticalPairs(nums3));
    }

    private static int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        for(int i = 0; i < nums.length - 1; i++)
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) goodPairs++;
            }
        return goodPairs;
    }
}
