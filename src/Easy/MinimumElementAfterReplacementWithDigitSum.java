package Easy;
//TASK.3300

public class MinimumElementAfterReplacementWithDigitSum {
    public static void main(String[] args) {
        int[] nums0 = {10000, 1000, 100, 10};
        int[] nums1 = {10,12,13,14};
        int[] nums2 = {102,14,4,4};
        int[] nums3 = {999,19,199};
        int[] nums4 = {9901,9902,9903,9904,9905,9906,9907,9908,9909,9910,9911,9912,9913,9914,9915,9916,9917,9918,9919,9920,9921,9922,9923,9924,9925,9926,9927,9928,9929,9930,9931,9932,9933,9934,9935,9936,9937,9938,9939,9940,9941,9942,9943,9944,9945,9946,9947,9948,9949,9950,9951,9952,9953,9954,9955,9956,9957,9958,9959,9960,9961,9962,9963,9964,9965,9966,9967,9968,9969,9970,9971,9972,9973,9974,9975,9976,9977,9978,9979,9980,9981,9982,9983,9984,9985,9986,9987,9988,9989,9990,9991,9992,9993,9994,9995,9996,9997,9998,9999,10000};

        System.out.println(minElement(nums0));
        System.out.println(minElement(nums1));
        System.out.println(minElement(nums2));
        System.out.println(minElement(nums3));
        System.out.println(minElement(nums4));
    }

    private static int minElement(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = replay(nums[i]);
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    private static int replay(int num) {
        int result = num/10000;
        num = num - (num/10000)*10000;

        result += num/1000;
        num = num - (num/1000)*1000;

        result += num/100;
        num = num - (num/100)*100;

        result += num/10;
        num = num - (num/10)*10;

        result += num;

        return result;
    }
}
