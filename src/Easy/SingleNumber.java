package Easy;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr1 = {2, 2, 1};
        int[] arr2 = {4, 1, 2, 1, 2};
        int[] arr3 = {1};
        int[] arr4 = {0, 1, 1, 0, 5, 4, 4, 2, 5};
        int[] arr5 = {11, -321, 4, 0, 1, 13, -3, 1, 0, 5, 4, -321, 11, 4, 2, 5, -3};
        int[] arr6 = {11, -321, 4, 0, 1, 14, -3, 1, 0, 5, 4, -321, 11, 4, 2, 5, 14, -3, 1101, -3210, 40, 20, 50, 130, -30, 10, 50, 40, -3210, 1101, 2, 20, 50, -30};

        System.out.println(singleNumber(arr1));
        System.out.println(singleNumber(arr2));
        System.out.println(singleNumber(arr3));
        System.out.println(singleNumber(arr4));
        System.out.println(singleNumber(arr5));
        System.out.println(singleNumber(arr6));
    }

    private static int singleNumber(int[] arr) {
        int oneNumber = arr[0];
        boolean find;

        for (int i = 0; i < arr.length; i++) {
            oneNumber = arr[i];
            find = false;
            for (int j = 0; j < arr.length; j++) {
                    if((i!=j) && (arr[j] == oneNumber)) {
                        find = true;
                        break;
                    }
                }
                if(!find) {
                    return oneNumber;
                }
            }

        return oneNumber;
        }
    }
