package Easy;
//TASK.3065 Minimum Operations To Exceed Theshold Value

public class MinimumOperationsToExceedThesholdValue {
    public static void main(String[] args) {
        int[] nums1 = {2,11,10,1,3};
        int[] nums2 = {1,1,2,4,9};
        int[] nums3= {1,1,2,4,9};

        System.out.println(minOperations(nums1, 10));
        System.out.println(minOperations(nums2, 1));
        System.out.println(minOperations(nums3, 9));
    }

    public static int minOperations(int[] nums, int k) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < k) {
                result++;
            }
        }
        return result;
    }
}
