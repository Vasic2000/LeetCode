package Easy;
//Task.3264

public class FinalArrayAfterKMult {
    public static void main(String[] args) {
        int[] nums1 = {2,1,3,5,6};
        int[] nums2 = {1,2};
        int[] nums3 = {4,1,3};

        int k1 = 5;
        int k2 = 3;
        int k3 = 2;

        int mltiplier1 = 2;
        int mltiplier2 = 4;
        int mltiplier3 = 5;

        printArray(getFinalState(nums1, k1, mltiplier1));
        printArray(getFinalState(nums2, k2, mltiplier2));
        printArray(getFinalState(nums3, k3, mltiplier3));
    }

    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            exchange(nums, multiplier);
        }
        return nums;
    }

    private static void exchange(int[] nums, int multiplier) {
        int index = 0;
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(min > nums[i]) {
                min = nums[i];
                index = i;
            }
        }
        nums[index] = nums[index] * multiplier;
    }

    public static void printArray(int[] nums) {
        short i = 1;
        if(nums != null)
            System.out.print(nums[0]);
        while(i < nums.length) {
            System.out.print(";" + nums[i]);
            i++;
        }
        System.out.println();
    }
}
