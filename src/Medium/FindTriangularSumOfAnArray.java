package Medium;

public class FindTriangularSumOfAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(triangularSum(arr));
    }


    public static int triangularSum(int[] nums) {
        int end = nums.length - 1;

        while (end > 0) {
            for (int i = 0; i < end; i++) {
                nums[i] = nums[i] + nums[i + 1];
                if (nums[i] >= 10) {
                    nums[i] = nums[i] - 10;
                }
            }
            nums[end] = 0;
            end--;
        }
        return nums[0];
    }
}