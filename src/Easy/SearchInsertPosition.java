package Easy;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] array1 = {1,3,5,6};

        System.out.println(searchInsert(array1, 5));
        System.out.println(searchInsert(array1, 2));
        System.out.println(searchInsert(array1, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
