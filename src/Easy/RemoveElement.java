package Easy;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr1 = new int[] {3,2,2,3};
        int[] arr2 = new int[] {0,1,2,2,3,0,4,2};
        int[] arr3 = new int[] {4,5};
        System.out.println(removeElement(arr1, 3));
        System.out.println(prints(arr1));
        System.out.println(removeElement(arr2, 2));
        System.out.println(prints(arr2));
        System.out.println(removeElement(arr3, 4));
        System.out.println(prints(arr3));
    }

    private static String prints(int[] arr) {
        StringBuilder st = new StringBuilder();
        for (int in: arr
             ) {
            st.append(in + ",");
        }
        return st.toString();
    }

    public static int removeElement(int[] nums, int val) {
        int k = nums.length;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == val) {
                k--;
                for (int j = i; j < nums.length - 2; j++) {
                    nums[j] = nums[j + 1];
                }
            }
        }
        return k;
    }
}
