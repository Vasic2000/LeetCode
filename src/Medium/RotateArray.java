package Medium;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] nums2 = new int[]{-1, -100, 3, 99};
        int[] nums3 = new int[]{0};
        int[] nums4 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] nums5 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        rotate(nums1, 8);
        rotate(nums2, 2);
        rotate(nums3, 6);
        rotate(nums4, 5);
        rotate(nums5, 123);

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


    public static void rotate(int[] nums, int k) {

        if ((float) k / nums.length > 1) {
            k = k % nums.length;
        }

        int[] temp = new int[k];

        if (k == 0)
            return;

        for (int i = 0; i < k; i++) {
            temp[k - i -1] = nums[nums.length - i - 1];
        }

        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        for (int i = 0; i < k; i++) {
                nums[i] = temp[i];
        }
    }
}

