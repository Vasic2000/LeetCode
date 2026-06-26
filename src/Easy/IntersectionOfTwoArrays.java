package Easy;
//TASK.349

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] nums3 = {4,9,5};
        int[] nums4 = {9,4,9,8,4};

        int[] nums5 = {4,9,5,11,2,3,5,1,1,1,4,5,6,6,12};
        int[] nums6 = {9,4,9,8,4,2,4,5,6,7};

        int[] result1 = intersection(nums1, nums2);
        printArray(result1);

        int[] result2 = intersection(nums3, nums4);
        printArray(result2);

        int[] result3 = intersection(nums5, nums6);
        printArray(result3);
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i] == nums2[j]) result.add(nums1[i]);
            }
        }

        int[] array = new int[result.size()];
        int index = 0;
        for (Integer num : result) {
            array[index++] = num; // Автораспаковка (unboxing)
        }
        return  array;
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

    //    Better decision
    public int[] intersection2(int[] nums1, int[] nums2) {
        HashSet<Integer>s1=new HashSet<>();
        HashSet<Integer>s2=new HashSet<>();

        for(int x:nums1){
            s1.add(x);
        }
        for(int y:nums2){
            if(s1.contains(y)){
                s2.add(y);
            }
        }int[] a=new int[s2.size()];
        int i=0;
        for(int x:s2){
            a[i++]=x;

        }return a;
    }
}
