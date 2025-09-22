package Easy;

//You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.
//Return the minimum number of operations to make all elements of nums divisible by 3.
//If x % 3 != 0 we can always increment or decrement x such that we only need 1 operation.
//        Add min(nums[i] % 3, 3 - (num[i] % 3)) to the count of operations.

public class MinimumOperationsDivisibleBy3 {
    public static void main(String[] args) {
        int[] example1 = {1,2,3,4};
        int[] example2 = {1,3,2,1};
        int[] example3 = {1,2,3,4,5,6,7,8,9,10};
        int[] example4 = {3,6,9};

        printArray(example1);
        System.out.println(minimumOperations(example1));

        printArray(example2);
        System.out.println(minimumOperations(example2));

        printArray(example3);
        System.out.println(minimumOperations(example3));

        printArray(example4);
        System.out.println(minimumOperations(example4));
    }

    private static int minimumOperations(int[] example) {
        int result = 0;
        for(int in: example) {
            if(in%3 != 0)
                result++;
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
