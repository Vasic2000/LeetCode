package Easy;
//TASK.3701

public class ComputeAlternatingSum {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,7};
        int[] nums2 ={100};

        System.out.println(alternatingSum(nums1));
        System.out.println(alternatingSum(nums2));
    }

    private static int alternatingSum(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i%2==0) {
                result = result + nums[i];
            } else {
                result = result - nums[i];
            }
        }
        return result;
    }
}
