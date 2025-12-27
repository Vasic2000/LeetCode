package Easy;
//Task.2974

public class MinimumNumberGame {
    public static void main(String[] args) {
        int[] example1 = {5,4,2,3};
        int[] example2 = {2,5};
        int[] example3 = {10,12,2,3,15,99,87,91,32,1,25,54};

        printArray(numberGame(example1));
        printArray(numberGame(example2));
        printArray(numberGame(example3));

    }

    public static int[] numberGame(int[] nums) {
        int[] result = new int[nums.length];
        int min1, min2, index1, index2;
        int move = 0;
        boolean find = false;

        while(move < nums.length) {
            min1 = 101;
            min2 = 101;
            index1 = 0;
            index2 = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < min1) {
                    min1 = nums[i];
                    index1 = i;
                }
            }
            nums[index1] = 101;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < min2) {
                    min2 = nums[i];
                    index2 = i;
                }
            }
            result[move] = min2;
            result[move + 1] = min1;
            nums[index2] = 101;

            move = move + 2;
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
