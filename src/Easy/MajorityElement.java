package Easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,3,2,3,5,1,-11,6,3};
        int[] array2 = {1000000000, 99999999, 3254660, -11000000,0, 99999999, 14};
        int[] array3 = {1, 2, 6, -1,2, 9, 14};
        System.out.println(majorityElement(array1));
        System.out.println(majorityElement(array2));
        System.out.println(majorityElement(array3));
    }

    public static int majorityElement(int[] nums) {
        HashMap major = new HashMap<Integer, Integer>();
        major.put(nums[0], 1);
                
        for(int i = 1; i < nums.length; i++) {
            if(major.containsKey(nums[i])) {
                major.put(nums[i], getValueByKey(major, nums[i]) + 1);
            } else {
                major.put(nums[i], 1);
            }
        }
        
        return keyOfMaxValue(major);
    }

    private static int keyOfMaxValue(HashMap<Integer, Integer> major) {
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : major.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return getKeyByValue(major, max);
    }

    private static int getKeyByValue(HashMap<Integer, Integer> major, int max) {
        for (Map.Entry<Integer, Integer> entry : major.entrySet()) {
            if (entry.getValue().equals(max)) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public static int getValueByKey(HashMap<Integer, Integer> map, int key) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return 0;
    }
}