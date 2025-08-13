package Easy;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int [] nums1 =  {0,2,1,5,3,4};
        int [] nums2 =  {5,0,2,1,3,4};
        int [] nums3 =  {5,2,3,0,4,1};

        printArray(nums1);
        printArray(buildArray(nums1));
        System.out.println();

        printArray(nums2);
        printArray(buildArray(nums2));
        System.out.println();

        printArray(nums3);
        printArray(buildArray(nums3));
    }

    public static int[] buildArray(int[] nums) {
        int [] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[nums[i]];
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
