package Easy;
//TASK.2859

import java.util.ArrayList;
import java.util.List;

public class SumOfValuesAtIndeciesKSetBits {
    public static void main(String[] args) {
        System.out.println(0 + " = 0 dualSum is " + dualSum(0));
        System.out.println(1 + " = 1 dualSum is " + dualSum(1));
        System.out.println(2 + " = 10 dualSum is " + dualSum(2));
        System.out.println(3 + " = 11 dualSum is " + dualSum(3));
        System.out.println(4 + " = 100 dualSum is " + dualSum(4));
        System.out.println(5 + " = 101 dualSum is " + dualSum(5));
        System.out.println(6 + " = 110 dualSum is " + dualSum(6));
        System.out.println(7 + " = 111 dualSum is " + dualSum(7));
        System.out.println(8 + " = 1000 dualSum is " + dualSum(8));
        System.out.println(9 + " = 1001 dualSum is " + dualSum(9));
        System.out.println(10 + " = 1010 dualSum is " + dualSum(10));
        System.out.println(11 + " = 1011 dualSum is " + dualSum(11));
        System.out.println(12 + " = 1100 dualSum is " + dualSum(12));
        System.out.println(13 + " = 1101 dualSum is " + dualSum(13));
        System.out.println(14 + " = 1110 dualSum is " + dualSum(14));
        System.out.println(15 + " = 1111 dualSum is " + dualSum(15));
        System.out.println(16 + " = 10000 dualSum is " + dualSum(16));

        System.out.println();
        System.out.println();


        List<Integer> nums1 = new ArrayList<>();
        nums1.add(5);
        nums1.add(10);
        nums1.add(1);
        nums1.add(5);
        nums1.add(2);
        int k1 = 1;

        List<Integer> nums2 = new ArrayList<>();
        nums2.add(4);
        nums2.add(3);
        nums2.add(2);
        nums2.add(1);
        int k2 = 2;

        List<Integer> nums3 = new ArrayList<>();
        nums3.add(15);
        nums3.add(11);
        nums3.add(2);
        nums3.add(13);
        nums3.add(4);
        nums3.add(13);
        nums3.add(11);
        int k3 = 3;

        System.out.println(sumIndicesWithKSetBits(nums1, k1));
        System.out.println(sumIndicesWithKSetBits(nums2, k2));
        System.out.println(sumIndicesWithKSetBits(nums3, k3));
    }

    private static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int result = 0;
        for (int i = 0; i < nums.size(); i++) {
            if(dualSum(i) == k) {
                result = result + nums.get(i);
            }
        }
        return result;
    }

    private static int dualSum(int i) {
        int k = 0;
        if (i == 0) return k;
        while (i > 0) {
            if(i%2 != 0) k++;
            i = i / 2;
        }
        return k;
    }
}
