package Easy;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums1 = new int[]{0, 1, 0, 3, 12};
        int[] nums2 = new int[]{0};
        int[] nums3 = new int[]{0, 0, 0, 143, 3, 5, 634, 3, 0};
        int[] nums4 = new int[]{0, 0, 143, 3, 5, 634, 3, 0};
        int[] nums5 = new int[]{0, 0, 0, 0, 0, 1, 4, 3, 3, 3, 0, 0, 0, 5, 634, 3, 0};

        moveZeroes(nums1);
        moveZeroes(nums2);
        moveZeroes(nums3);
        moveZeroes(nums4);
        moveZeroes(nums5);

        printArray(nums1);
        printArray(nums2);
        printArray(nums3);
        printArray(nums4);
        printArray(nums5);
    }

    public static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length - 1; i++)
            System.out.print(array[i] + ", ");
        System.out.println(array[array.length - 1] + "}");
    }

    public static void moveZeroes(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                    nums[j + 1] = 0;
                }
            }
        }
    }
}
