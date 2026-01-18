package Easy;
//TASK.3512
//You are given an integer array nums and an integer k. You can perform the following operation any number of times:
//
//Select an index i and replace nums[i] with nums[i] - 1.
//Return the minimum number of operations required to make the sum of the array divisible by k.

public class MinimumOperationsDivisibleByK {
    public static void main(String[] args) {
        int[] example1 = {3,9,7};
        int k1 = 5;

        int[] example2 = {3,5,7};
        int k2 = 4;

        int[] example3 = {3,2};
        int k3 = 6;

        int[] example4 = {3,6,9};
        int k4 = 3;

        System.out.print("Num 1 = ");
        printArray(example1);
        System.out.println("k1 = " + k1);
        System.out.println(minimumOperationsK(example1, k1));

        System.out.print("Num 2 = ");
        printArray(example2);
        System.out.println("k2 = " + k2);
        System.out.println(minimumOperationsK(example2, k2));

        System.out.print("Num 3 = ");
        printArray(example3);
        System.out.println("k3 = " + k3);
        System.out.println(minimumOperationsK(example3, k3));

        System.out.print("Num 4 = ");
        printArray(example4);
        System.out.println("k4 = " + k4);
        System.out.println(minimumOperationsK(example4, k4));
    }

    private static int minimumOperationsK(int[] example, int k) {
//        int result = 0;
//        while(sumic(example)%k != 0) {
//            result++;
//        }
//        return result;

        return sumic(example)%k;
    }

    private static int sumic(int[] example) {
        int sum = 0;
        for(int i = 0; i < example.length; i++) {
            sum +=example[i];
        }
        return sum;
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
