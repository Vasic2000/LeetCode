package Easy;
//TASK.3512

public class ConsentrateArrayWithReverse {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3};
        int [] nums2 = {1};
        int [] nums3 = {9,2,3,7,5,5,7,5,1};

        printArray(concatWithReverse(nums1));
        printArray(concatWithReverse(nums2));
        printArray(concatWithReverse(nums3));
    }

    public static int[] concatWithReverse(int[] nums) {
        int length = nums.length;
        int[] result = new int[length*2];

        for (int i = 0; i < length; i++) {
            result[i] = nums[i];
            result[2*length - 1 - i] = nums[i];
        }
        return result;
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
