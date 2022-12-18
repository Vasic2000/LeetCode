package Easy;

public class DuplicatesRemove {

    public static void main(String[] args) {
        int [] num1 = {1,1,2};
        int [] num2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int [] num3 = {0, 1, 1, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 7, 8, 9};

        removeDuplicates(num1);
        removeDuplicates(num2);
        removeDuplicates(num3);

    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;
        int number = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > number) {
                number = nums[i];
                k++;
                nums[k] = nums[i];
            }
        }

        System.out.print(k+1 + ", nums = [");
        for(int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.print(nums[nums.length - 1]);
        System.out.println("]");

        return k + 1;
    }
}
