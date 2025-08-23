package Easy;
//Task.2433

public class FindTheOriginalArrayOfPerfixXor {
    public static void main(String[] args) {
        int[] pref1 = {5, 2, 0, 3, 1};
        int[] pref2 = {13};
        int[] pref3 = {1, 15, 141, 1, 1};
//  Побитовое исключающее
//        0 0 0 0 0 0 0 1 1  = 3
//        0 0 0 0 0 0 0 0 1  = 1
//        __________________
//        0 0 0 0 0 0 0 0 1  = 2

//        0 0 0 0 0 0 0 0 1  = 1
//        0 0 0 0 0 0 1 0 1  = 5
//        __________________
//        0 0 0 0 0 0 1 0 0  = 4

//        0 0 0 0 0 0 0 1 1  = 3
//        0 0 0 0 0 0 1 0 1  = 5
//        __________________
//        0 0 0 0 0 0 1 1 0  = 6

        System.out.print("3 ^ 1 = ");
        System.out.println(3 ^ 1);

        System.out.print("1 ^ 5 = ");
        System.out.println(1 ^ 5);

        System.out.print("1 ^ 3 = ");
        System.out.println(1 ^ 3);

        System.out.print("3 ^ 5 = ");
        System.out.println(3 ^ 5);

        System.out.print("5 ^ 3 = ");
        System.out.println(5 ^ 3);

        printArray(findArray(pref1));
        printArray(findArray(pref2));
        printArray(findArray(pref3));
    }

    private static int[] findArray(int[] pref) {
        int[] answer = new int[pref.length];
        answer[0] = pref[0];

        for (int i = 1; i < pref.length; i++) {
            answer[i] = pref[i] ^ pref[i - 1];
        }
        return answer;
    }

    public static void printArray(int[] nums) {
        short i = 1;
        if (nums != null)
            System.out.print(nums[0]);
        while (i < nums.length) {
            System.out.print(";" + nums[i]);
            i++;
        }
        System.out.println();
    }
}
