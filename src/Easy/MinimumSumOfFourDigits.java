package Easy;
//Task.2160

public class MinimumSumOfFourDigits {
    public static void main(String[] args) {
        int n1 = 2932;
        int n2 = 4009;
        int n3 = 9878;

        System.out.println(minimumSum(n1));
        System.out.println(minimumSum(n2));
        System.out.println(minimumSum(n3));
    }

    private static int minimumSum(int num) {

        int[] nums = new int[4];

        nums[0] = num/1000;
        num = num - nums[0] * 1000;
        nums[1] = num/100;
        num = num - nums[1] * 100;
        nums[2] = num/10;
        nums[3] = num - nums[2] * 10;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < (3 - i); j++) {
                if(nums[j] > nums[j+1]) {
                    num = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = num;
                }
            }
        }
        if((nums[0]*10 + nums[1]*10 + nums[2] + nums[3]) < (nums[0] + nums[1]*100 + nums[2]*10 + nums[3]))
            return nums[0]*10 + nums[1]*10 + nums[2] + nums[3];
        else
            return nums[0] + nums[1]*100 + nums[2]*10 + nums[3];
    }
}
