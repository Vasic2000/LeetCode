package Easy;
//TASK.338 CountingBits
//Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
// ans[i] is the number of 1's in the binary representation of i.

public class CountingBits {
    public static void main(String[] args) {
        printArray(countBits(2));
        printArray(countBits(5));
        printArray(countBits(13));
    }

    private static int[] countBits(int i) {
        int[] result = new int[i + 1];
        for (int j = 0; j <= i; j++) {
            result[j] = count1From(j);
        }
        return result;
    }

    private static int count1From(int j) {
        if(j==0) {
            return 0;
        }

        int result = 0;

        while(j > 0) {
            if(j%2 != 0) {
                result++;
            }
            j = j/2;
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
