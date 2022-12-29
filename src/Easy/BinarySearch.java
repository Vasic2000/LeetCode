package Easy;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 9));
        System.out.println(search(nums, -4));

        int[] nums2 = new int[]{0};
        System.out.println(search(nums2, 0));
        System.out.println(search(nums2, 5));

        int[] nums3 = new int[]{-11, -6, -2, 0, 1, 3, 5, 9, 12, 14, 15};
        System.out.println(search(nums3, 0));
        System.out.println(search(nums3, 15));
        System.out.println(search(nums3, 17));
        System.out.println(search(nums3, -11));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int middle;

        if ((target < nums[0]) || (target > nums[nums.length - 1]))
            return -1;

        while (end > start) {
            middle = (end + start) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                start = middle + 1;
            } else {
                end = middle;
            }
        }
        return -1;


//        int left = 0;
//        int right = nums.length - 1;
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            if (nums[mid] == target) return mid;
//            if (nums[mid] > target) right = mid - 1;
//            else left = mid + 1;
//        }
//        return -1;

    }
}
