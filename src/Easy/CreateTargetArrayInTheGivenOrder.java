package Easy;
//TASK.1389
//Create Target Array In The Given Order

import java.util.ArrayList;

public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 2, 3, 4};
        int[] index1 = {0, 1, 2, 2, 1};

        int[] nums2 = {1, 2, 3, 4};
        int[] index2 = {0, 1, 2, 3};

        int[] nums3 = {1};
        int[] index3 = {0};

        printArray(createTargetArray(nums1, index1));
        printArray(createTargetArray(nums2, index2));
        printArray(createTargetArray(nums3, index3));
    }

    private static int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            array.add(index[i], nums[i]);
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = array.get(i);
        }
        return result;
    }

    public static void printArray(int[] nums) {
        short i = 1;
        if (nums != null)
            System.out.print("{" + nums[0]);
        while (i < nums.length) {
            System.out.print(";" + nums[i]);
            i++;
        }
        System.out.println("}");
    }
}
