package EASY;
//1365.How Many Numbers Are Smaller Than the Current Number

public class NumbersSmallerThen {
    public static void main(String[] args) {
        int [] array1 = {8,1,2,2,3};
        int [] array2 = {6,5,4,8};
        int [] array3 = {7,7,7,7,7};
        int [] array4 = {0,11,11,2,3};

        printArray(array1);
        printArray(smallerNumbersThanCurrent(array1));
        printArray(array2);
        printArray(smallerNumbersThanCurrent(array2));
        printArray(array3);
        printArray(smallerNumbersThanCurrent(array3));
        printArray(array4);
        printArray(smallerNumbersThanCurrent(array4));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] newArray = new int[nums.length];
        int lessThan = 0;

        for(int i = 0; i < nums.length; i++) {
            lessThan = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] < nums[i]) lessThan++;
            }
            newArray[i] = lessThan;
        }
        return newArray;
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
