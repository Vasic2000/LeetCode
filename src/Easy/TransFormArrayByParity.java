package Easy;
//Task.3467
public class TransFormArrayByParity {
    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 1};
        int[] nums2 = {1, 5, 1, 4, 2};
        int[] nums3 = {41, 16, 7, 4, 8,14, 1, 2, 3, 55, 4 ,6};

        printArray(transformArray(nums1));
        printArray(transformArray(nums2));
        printArray(transformArray(nums3));
    }

    public static int[] transformArray(int[] nums) {
        int [] result = new int[nums.length];
        int even = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2 == 0) even++;
        }

        for(int i = 0; i < even; i++) {
            result[i] = 0;
        }
        for(int i = even; i < result.length; i++) {
            result[i] = 1;
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
