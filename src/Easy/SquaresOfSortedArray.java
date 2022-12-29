package Easy;

public class SquaresOfSortedArray {

    public static void main(String[] args) {
        int[] array1 = new int[]{-4, -1, 0, 3, 10};
        int[] array2 = new int[]{-7, -3, 2, 3, 11};
        int[] array3 = new int[]{0};
        int[] array4 = new int[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 5};

        printArray(sortedSquares(array1));
        printArray(sortedSquares(array2));
        printArray(sortedSquares(array3));
        printArray(sortedSquares(array4));
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            nums[i] = (int) Math.pow(nums[i], 2);

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }

    public static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length - 1; i++)
            System.out.print(array[i] + ", ");
        System.out.println(array[array.length - 1] + "}");
    }
}
