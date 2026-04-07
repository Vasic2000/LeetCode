package Easy;
//TASK.3289 The Two Sneaky Numbers Of Digitville

import java.util.HashSet;

public class TheTwoSneakyNumbersOfDigitville {
    public static void main(String[] args) {
        int[] array1 = {0,1,1,0};
        int[] array2 = {0,3,2,1,3,2};
        int[] array3 = {7,1,5,4,3,4,6,0,9,5,8,2,3,3,3,4,3,3,6,6,6};

        printArray(getSneakyNumbers(array1));
        printArray(getSneakyNumbers(array2));
        printArray(getSneakyNumbers(array3));
    }

    private static int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> arraing = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(arraing.add(nums[i])) {

            } else {
                res.add(nums[i]);
            }
        }

        int [] result = new int[res.size()];
        int i = 0;

        for (int element : res) {
            result[i] = element;
            i++;
        }
        return result;
    }

    public static void printArray(int[] nums) {
        short i = 1;
        if(nums != null)
            System.out.print("{" + nums[0]);
        while(i < nums.length) {
            System.out.print(";" + nums[i]);
            i++;
        }
        System.out.println("}");
    }
}
