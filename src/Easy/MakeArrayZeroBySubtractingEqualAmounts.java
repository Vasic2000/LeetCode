package Easy;

public class MakeArrayZeroBySubtractingEqualAmounts {

    public static void main(String[] args) {

//        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4, 15, 21, 99999, 2, 0, 0, 54, 2};
        int[] nums3 = {1, 5, 0, 3, 5};
        int[] nums4 = {0};

//        System.out.println(minimumOperations(nums1));
        System.out.println(minimumOperations(nums2));
        System.out.println(minimumOperations(nums3));
        System.out.println(minimumOperations(nums4));
    }

    public static int minimumOperations(int[] nums) {
        int step = 0;
        int minimumValue = findMin(nums);

        printArr(nums);
        System.out.println("Min = " + minimumValue);

        while(minimumValue != 0) {
            step++;
            decreaseArray(nums, minimumValue);
            minimumValue = findMin(nums);
            printArr(nums);
            System.out.println("Min = " + minimumValue);
        }
        return step;
    }

    private static void decreaseArray(int[] nums, int min) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[i] = nums[i] - min;
            }
        }
    }

    private static int findMin(int[] nums) {
        int min = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (min == 0) {
                    min = nums[i];
                }
                if (min > nums[i]) {
                    min = nums[i];
                }
            }
        }
        return min;
    }

    private static void printArr(int[] nums) {
        System.out.print("[");
        for(int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.print(nums[nums.length - 1]);
        System.out.println("]");
    }

}
