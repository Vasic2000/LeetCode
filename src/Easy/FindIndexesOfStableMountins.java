package Easy;
//Task.3285 Find Indexes Of Stable Mountins

import java.util.ArrayList;
import java.util.List;

public class FindIndexesOfStableMountins {
    public static void main(String[] args) {
        int[] height1 = {1,2,3,4,5};
        int[] height2 = {10,1,10,1,10};
        int[] height3 = {4,6,5,8,11,11,11,5,6,6};

        printArray(stableMountains(height1, 2));
        printArray(stableMountains(height2, 3));
        printArray(stableMountains(height2, 10));
        printArray(stableMountains(height3, 5));
    }

    private static List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> result = new ArrayList<>();
        boolean isStable = false;
        for (int i = 0; i < height.length; i++) {
            if(isStable) {
                isStable = false;
                result.add(i);
            }
            if(height[i] > threshold) {
                isStable = true;
            }
        }
        return result;
    }

    public static void printArray(List<Integer> nums) {
        short i = 1;
        System.out.print("{");
        if(nums.size()!=0) {
            System.out.print(nums.get(0));
            while (i < nums.size()) {
                System.out.print(";" + nums.get(i));
                i++;
            }
        }
        System.out.println("}");
    }
}
