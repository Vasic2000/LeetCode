package Medium;

public class MinOperationsToMoveAllBalls {
    public static void main(String[] args) {
        String boxes1 = "110";
        String boxes2 = "001011";
        String boxes3 = "001001110110010";

        int [] minOpr1 = minOperations(boxes1);
        int [] minOpr2 = minOperations(boxes2);
        int [] minOpr3 = minOperations(boxes3);

        System.out.println(boxes1);
        printArray(minOpr1);

        System.out.println(boxes2);
        printArray(minOpr2);

        System.out.println(boxes3);
        printArray(minOpr3);
    }

    private static int[] minOperations(String boxes) {
        char[] box = boxes.toCharArray();
        int [] result = new int[boxes.length()];
        int medResult;

        for (int i = 0; i < box.length; i++) {
            medResult = 0;
            for (int j = box.length -1; j >=0 ; j--) {
                if(box[j] == '1') medResult = medResult + Math.abs(j - i);
            }
            result[i] = medResult;
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
