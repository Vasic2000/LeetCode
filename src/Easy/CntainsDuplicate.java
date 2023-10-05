package Easy;

import java.util.HashSet;

public class CntainsDuplicate {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicate(nums2));
        System.out.println(containsDuplicate(nums3));
    }

//    public static boolean containsDuplicate(int[] nums) {
//        for(int i = 0; i < nums.length - 1; i++)
//            for(int j = i + 1; j < nums.length; j++) {
//                if(nums[i] == nums [j]) {
//                    return true;
//                }
//            }
//        return false;
//    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> store = new HashSet<>();

        for( int i = 0 ; i < nums.length; i++ ) {
            if(!store.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

}
