package Easy;
//TASK.3427 Sum Of Variable Length Subarrays

public class SumOfVariableLengthSubarrays {
    public static void main(String[] args) {
        int[] nums1 = {2,3,1};
        int[] nums2 = {3,1,1,2};
        int[] nums3 = {4,1,6,2,7,2,3,4,6,112,54,67,42,87,900,11,1,67,7};

        System.out.println(subarraySum(nums1));
        System.out.println(subarraySum(nums2));
        System.out.println(subarraySum(nums3));
    }

    private static int subarraySum(int[] nums) {
        int start;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(0, i-nums[i]);
            for (int j = start; j <= i; j++) {
                result += nums[j];
            }
        }
        return result;
    }
}
