package Easy;
//TASK.2574
//You are given a 0-indexed integer array nums of size n.
//Define two arrays leftSum and rightSum where:
//leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
//rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
//Return an integer array answer of size n where answer[i] = |leftSum[i] - rightSum[i]|.

public class LeftRightSumDifferences {
    public static void main(String[] args) {
        int[] nums1 = {10, 4, 8, 3};
        int[] nums2 = {1};
        int[] nums3 = {9, 4, 8, 15, 6};

        printArray(nums1);
        printArray(leftRightDifference(nums1));
        System.out.println();

        printArray(nums2);
        printArray(leftRightDifference(nums2));
        System.out.println();

        printArray(nums3);
        printArray(leftRightDifference(nums3));
    }

    private static int[] leftRightDifference(int[] nums) {
        int[] answer = new int[nums.length];

        int left, right;
        left = 0;
        right = 0;
        for (int i = 1; i < nums.length; i++) {
            right = right + nums[i];
        }

        for (int i = 1; i < nums.length; i++) {
            answer[i - 1] = Math.abs(left - right);
            left += nums[i - 1];
            right -= nums[i];
            answer[i] = Math.abs(left - right);
        }
        return answer;

//        int[] answer = new int[nums.length];
//        int left, right;
//        for (int i = 0; i < nums.length; i++) {
//            left = 0;
//            right = 0;
//            for (int j = 0; j < i; j++) {
//                left+=nums[j];
//            }
//            for (int j = i + 1; j < nums.length; j++) {
//                right +=nums[j];
//            }
//            answer[i] = Math.abs(left - right);
//        }
//        return answer;
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
