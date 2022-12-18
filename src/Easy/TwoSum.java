public class TwoSum {
    public static void main(String[] args) {
        int inbox [] = {3,3};
        int tag = 6;
        System.out.print(twoSum(inbox, tag)[0] + ", ");
        System.out.println(twoSum(inbox, tag)[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int [] twoSum = new int[2];
        for(int i = 0; i < nums.length; i++)
            for(int j = i + 1; j < nums.length; j++)
                if((nums[j] + nums[i]) == target) {
                    twoSum[0] = i;
                    twoSum[1] = j;
                    return twoSum;
        }
        return twoSum;
    }
}
