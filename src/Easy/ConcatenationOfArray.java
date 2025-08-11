package Easy;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] example1 = {1, 2, 1};
        int[] example2 = {1, 3, 2, 1};
        int[] example3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        printArray(example1);
        printArray(getConcatenation(example1));

        printArray(example2);
        printArray(getConcatenation(example2));

        printArray(example3);
        printArray(getConcatenation(example3));
    }

    public static void printArray(int[] nums) {
        short i = 1;
        if (nums != null)
            System.out.print(nums[0]);
        while (i < nums.length) {
            System.out.print(";" + nums[i]);
            i++;
        }
        System.out.println();
    }


    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        short i = 0;
        while (i < nums.length) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
            i++;
        }
        return result;
    }
}
