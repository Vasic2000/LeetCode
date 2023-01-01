package Easy;

public class TwoSum {
    public static void main(String[] args) {
        int inbox [] = {2,7,11,15};
        int tag = 9;
        System.out.print(twoSum(inbox, tag)[0] + ", ");
        System.out.println(twoSum(inbox, tag)[1]);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int [] twoSum = new int[2];
        for(int i = 0; i < numbers.length; i++)
            for(int j = i + 1; j < numbers.length; j++)
                if((numbers[j] + numbers[i]) == target) {
                    twoSum[0] = i;
                    twoSum[1] = j;
                    return twoSum;
        }
        return twoSum;
    }
}
