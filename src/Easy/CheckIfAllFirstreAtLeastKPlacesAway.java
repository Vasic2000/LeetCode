package Easy;
//Task.1431

public class CheckIfAllFirstreAtLeastKPlacesAway {
    public static void main(String[] args) {
        int[] nums1 = {1,0,0,0,1,0,0,1};
        int[] nums2 = {1,0,0,0,1,0,0,1};
        int[] nums3 = {1,0,0,1,0,1,0,0,0,1};

        int k1 = 2;
        int k2 = 2;
        int k3 = 2;

        System.out.println(kLengthApart(nums1, k1));
        System.out.println(kLengthApart(nums2, k2));
        System.out.println(kLengthApart(nums3, k3));
    }

    public static boolean kLengthApart(int[] nums, int k) {

        int distance = k;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                if(distance < k) return false;
                distance = 0;
            } else {
                distance++;
            }
        }

        return true;
    }
}
