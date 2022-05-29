package Easy;

public class searchInsertPosition {
    public static void main(String[] args) {
        int[] array = {1,3,5,6};
        System.out.println(searchInsert(array,5));
        System.out.println(searchInsert(array,2));
        System.out.println(searchInsert(array,7));
        System.out.println(searchInsert(array,0));
    }

    public static int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= target) return i;
        }
        return nums.length;
    }
}
