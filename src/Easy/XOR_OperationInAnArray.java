package Easy;
//TASK.1486
//You are given an integer n and an integer start.
//Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.
//Return the bitwise XOR of all elements of nums.

public class XOR_OperationInAnArray {
    public static void main(String[] args) {
        System.out.println(xorOperationn(5, 0));
        System.out.println(xorOperationn(4, 3));
        System.out.println(xorOperationn(18,11));
    }

    private static int xorOperationn(int n, int start) {
//        int[] array = new int[n];
        int result = start;

        for (int i = 1; i < n; i++) {
//            array[i] = start + 2 * i;
            result = result^(start + 2 * i);
        }
        return result;
    }
}
