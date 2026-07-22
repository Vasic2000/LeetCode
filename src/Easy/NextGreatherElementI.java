package Easy;
//TASK.496. Next Greater Element I
//The next greater element of some element x in an array
//is the first greater element that is to the right of x in the same array.

public class NextGreatherElementI {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] nums3 = {2,4};
        int[] nums4 = {1,2,3,4};
        int[] nums5 = {12,36,100,6};
        int[] nums6 = {5,12,36,544,13,100,6,7};

        printArray(nextGreaterElement(nums1, nums2));
        printArray(nextGreaterElement(nums3, nums4));
        printArray(nextGreaterElement(nums5, nums6));
    }

    private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int j = 0;
            int k;
            while(nums1[i] != nums2[j]) {
                j++;
            }
            while((j < nums2.length) && (nums1[i]>=nums2[j])) {
                j++;
            }
            if(j == nums2.length) {
                ans[i] = -1;
            } else {
                ans[i] = nums2[j];
            }
        }
        return ans;
    }

    public static void printArray(int[] nums) {
        short i = 1;
        if(nums != null)
            System.out.print(nums[0]);
        while(i < nums.length) {
            System.out.print(";" + nums[i]);
            i++;
        }
        System.out.println();
    }
}
