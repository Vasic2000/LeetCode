package Easy;

//Task.3194
//You have an array of floating point numbers averages which is initially empty. You are given an array nums of n integers where n is even.
//You repeat the following procedure n / 2 times:
//Remove the smallest element, minElement, and the largest element maxElement, from nums.
//Add (minElement + maxElement) / 2 to averages.
//Return the minimum element in averages.

public class MinimumAverageOfSmalestAndLagestElements {
    public static void main(String[] args) {
        int[] num1 = {7,8,3,4,15,13,4,1};
        int[] num2 = {1,9,8,3,10,5};
        int[] num3 = {1,2,3,7,8,9};
        int[] num4 = {150,300,100,12,16,200};

        System.out.println(minimumAverage(num1));
        System.out.println(minimumAverage(num2));
        System.out.println(minimumAverage(num3));
        System.out.println(minimumAverage(num4));
    }

    public static double minimumAverage(int[] nums) {
        int temp;
        double minim = nums[0];

        double [] average = new double[nums.length/2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] < nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }


        for (int i = 0; i < nums.length/2; i++) {
            average[i] = (double) (nums[i] + nums[nums.length - 1 - i])/2;
        }

        minim = average[0];

        for (int i = 0; i < nums.length/2; i++) {
            if(average[i] < minim) {
                minim = average[i];
            };
        }

        return minim;
    }
}
