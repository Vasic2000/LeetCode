package Easy;
//Task.1480

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4};
        int [] array2 = {1,1,1,1,1};
        int [] array3 = {3,1,2,10,1};

        printArray(array1);
        System.out.print("is -> ");
        printArray(runingSum(array1));
        printArray(array2);
        System.out.print("is -> ");
        printArray(runingSum(array2));
        printArray(array3);
        System.out.print("is -> ");
        printArray(runingSum(array3));
    }

    private static int[] runingSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
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
