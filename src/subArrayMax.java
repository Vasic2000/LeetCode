public class subArrayMax {
    public static void main(String[] args) {
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2 = {1};
        int[] nums3 = {5,4,-1,7,8};
        int[] nums4 = {-1};

        System.out.println(maxSubArray(nums1));
        System.out.println(maxSubArray(nums2));
        System.out.println(maxSubArray(nums3));
        System.out.println(maxSubArray(nums4));
    }
    public static int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum = nums[0];

        for(int i = 1; i < nums.length; i++) {

            if((sum + nums[i]) > nums[i])
                sum = sum + nums[i];
            else
                sum = nums[i];
            if(sum > result)
                result = sum;
        }

        return result;
    }

//    public static int maxSubArray(int[] nums) {
//        int sum, record = 0;
//        for(int i = 0; i < nums.length; i++) {
//            record = nums[i];
//        }
//
//        for(int i = 0; i < nums.length; i++) {
//            for(int j = nums.length; j > i; j--) {
//                sum = 0;
//                for(int k = i; k < j; k++) {
//                    sum += nums[k];
//                }
//                if(sum > record) record = sum;
//            }
//        }
//
//        return record;
//    }
}
