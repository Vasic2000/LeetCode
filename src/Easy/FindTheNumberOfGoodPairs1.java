package Easy;
//TASK.3162 Find the Number of Good Pairs I

public class FindTheNumberOfGoodPairs1 {
    public static void main(String[] args) {
        int[] nums1 = {1,3,4};
        int[] nums2 = {1,3,4};

        int[] nums3 = {1,2,4,12};
        int[] nums4 = {2,4};

        System.out.println(numberOfPairs(nums1, nums2, 1));
        System.out.println(numberOfPairs(nums3, nums4, 3));
    }

    public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int result = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i]%(nums2[j]*k) == 0) result++;
            }
        }
        return result;
    }
}
