package Easy;
//TASK.1313 Decompress Run Length Encoded List

public class DecompressRun_LengthEncodeList {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {1,1,2,3};
        int[] array3 = {1,7,3,5,6,4,4,5};

        printArray(decompressRLEist(array1));
        printArray(decompressRLEist(array2));
        printArray(decompressRLEist(array3));
    }

    private static int[] decompressRLEist(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i+=2) {
            len+=nums[i];
        }

        int[] result = new int[len];
        int index = 0;

        for (int i = 0; i < nums.length; i+=2) {
            for (int j = 0; j < nums[i]; j++) {
                result[index] = nums[i+1];
                index++;
            }
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
