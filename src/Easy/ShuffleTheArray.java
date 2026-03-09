// Task.1470
package Easy;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums1 = {2,5,1,3,4,7};
        int[] nums2 = {1,2,3,4,4,3,2,1};
        int[] nums3 = {1,2,1,2};

        printArray(shuffle(nums1, 3));
        printArray(shuffle(nums2, 4));
        printArray(shuffle(nums3, 2));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];

        int j = 0;

        for (int i = 0; i < n * 2; i=i+2) {
            result[i] = nums[j];
            result[i + 1] = nums[j + n];
            j++;
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
