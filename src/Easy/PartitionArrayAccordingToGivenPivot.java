package Easy;

public class PartitionArrayAccordingToGivenPivot {

//    TASK.2161
//
//    You are given a 0-indexed integer array nums and an integer pivot. Rearrange nums such that the following conditions are satisfied:
//
//    Every element less than pivot appears before every element greater than pivot.
//    Every element equal to pivot appears in between the elements less than and greater than pivot.
//    The relative order of the elements less than pivot and the elements greater than pivot is maintained.
//    More formally, consider every pi, pj where pi is the new position of the ith element and pj is the new position of the jth element. If i < j and both elements are smaller (or larger) than pivot, then pi < pj.


    public static void main(String[] args) {
        int[] example1 = {9,12,5,10,14,3,10};
        int pivot1 = 10;

        int[] example2 = {-3,4,3,2};
        int pivot2 = 2;

        int[] example3 = {3,2};
        int pivot3 = 6;

        int[] example4 = {7,3,6,9};
        int pivot4 = 5;

        printArray(pivotArray(example1, pivot1));
        printArray(pivotArray(example2, pivot2));
        printArray(pivotArray(example3, pivot3));
        printArray(pivotArray(example4, pivot4));
    }

    public static int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int[] result2 = new int[nums.length];
        int start = 0;
        int start2 = 0;


        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < pivot) {
                result[start] = nums[i];
                start++;
            }

            if(nums[i] > pivot) {
                result2[start2] = nums[i];
                start2++;
            }
        }

        for (int i = start; i < nums.length - start2; i++) {
            result[i] = pivot;
            start++;
        }

        for (int i = start; i < nums.length; i++) {
            result[i] = result2[i - start];
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
