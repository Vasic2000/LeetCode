package Easy;
//TASK.1528

public class ShuffleString {
    public static void main(String[] args) {
        String s1 = "codeleet";
        int[] arr1 = {4,5,6,7,0,2,1,3};

        String s2 = "abc";
        int[] arr2 = {0,1,2};

        String s3 = "hellowworld";
        int[] arr3 = {0,1,2,3,4,5,6,7,8,9,10};

        String s4 = "weoorldhllw";
        int[] arr4 = {6,1,4,7,8,9,10,0,3,2,5};

        System.out.println(restoreString(s1, arr1));
        System.out.println(restoreString(s2, arr2));
        System.out.println(restoreString(s3, arr3));
        System.out.println(restoreString(s4, arr4));
    }

    public static String restoreString(String s, int[] indices) {
        char[] result = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = s.charAt(i);
        };
        return String.valueOf(result);
    }
}
