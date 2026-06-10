package Easy;
//TASK.2956 Find Common Elements Beetween Two Arrays
//You are given two integer arrays nums1 and nums2 of sizes n and m, respectively. Calculate the following values:
//
//answer1 : the number of indices i such that nums1[i] exists in nums2.
//answer2 : the number of indices i such that nums2[i] exists in nums1.
//
//Return [answer1,answer2].

public class FindCommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {2,3,2};
        int[] nums2 = {1,2};
        int[] nums3 = {4,3,2,3,1};
        int[] nums4 = {2,2,5,2,3,6};
        int[] nums5 = {3,4,2,3};
        int[] nums6 = {1,5};
        int[] nums7 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] nums8 = {9,8,7,6,5,4,3,2,1};

        printArray(findIntersectionValues(nums1, nums2));
        printArray(findIntersectionValues(nums3, nums4));
        printArray(findIntersectionValues(nums5, nums6));
        printArray(findIntersectionValues(nums7, nums8));
    }

    private static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int answer1 = 0;
        int answer2 = 0;

        for (int i = 0; i < nums1.length; i++) {
            if(ifExist(nums1[i], nums2))
                answer1++;
        }

        for (int i = 0; i < nums2.length; i++) {
            if(ifExist(nums2[i], nums1))
                answer2++;
        }

        int [] result = {answer1, answer2};
        return result;
    }

    private static boolean ifExist(int i, int[] nums) {
        for (int j = 0; j < nums.length; j++) {
            if(i == nums[j]) return true;
        }
        return false;
    }

    public static void printArray(int[] nums) {
        short i = 1;
        if (nums != null)
            System.out.print(nums[0]);
        while (i < nums.length) {
            System.out.print(";" + nums[i]);
            i++;
        }
        System.out.println();
    }
}
