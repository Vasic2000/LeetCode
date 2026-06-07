package Easy;
// TASK.2553 Sepatrate the Digits in an Array

public class SeparateTheDigitsInAnArray {
    public static void main(String[] args) {
        int[] nums1 = {13, 25, 83, 77};
        int[] nums2 = {7, 1, 3, 9};
        int[] nums3 = {101, 12, 0, 365, 4, 25, 24, 12};

        printArray(nums1);
        System.out.println(" ->");
        printArray(separateDigits(nums1));
        System.out.println();

        printArray(nums2);
        System.out.println(" ->");
        printArray(separateDigits(nums2));
        System.out.println();

        printArray(nums3);
        System.out.println(" ->");
        printArray(separateDigits(nums3));
    }

    private static int[] separateDigits(int[] nums) {
        StringBuilder array = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            array.append(nums[i]);
        }
        int[] result = new int[array.length()];

        for (int i = 0; i < array.length(); i++) {
            result[i] = Character.getNumericValue(array.charAt(i));
        }
        return result;
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
