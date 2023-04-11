package Easy;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        printArray(num1);
        printArray(num2);
        merge(num1, 3, num2, 3);
        printArray(num1);

        int[] num3 = {1};
        int[] num4 = {};
        printArray(num3);
        printArray(num4);
        merge(num3, 1, num4, 0);
        printArray(num3);

        int[] num5 = {0};
        int[] num6 = {1};
        printArray(num3);
        printArray(num4);
        merge(num5, 0, num6, 1);
        printArray(num5);

        int[] num7 = {4,0,0,0,0,0};
        int[] num8 = {1,2,3,5,6};
        printArray(num7);
        printArray(num8);
        merge(num7, 1, num8, 5);
        printArray(num7);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // First array pointer
        int j = n - 1; // Second array pointer

        for (int k = nums1.length; k > 0; k--) { // First array pointer full length
            if (i < 0) {  // Corner case: only second array left
                nums1[k - 1] = nums2[j];
                j--;
            } else {
                if (j < 0) // Corner case: only first array left
                    break;

                if (nums1[i] < nums2[j]) {
                    nums1[k - 1] = nums2[j];
                    j--;
                } else {
                    nums1[k - 1] = nums1[i];
                    i--;
                }
            }
        }
    }


    public static void printArray(int[] nums) {
        if (nums.length > 0) {
            System.out.print("[" + nums[0]);
            for (int i = 1; i < nums.length; i++) {
                System.out.print(", " + nums[i]);
            }
            System.out.println("]");
        } else {
            System.out.println("[]");
        }
    }
}
