package Yandex;

public class MaximumIndexBeforeX {

    public static void main(String[] args) {
        int[] arr1 = new int[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        System.out.println(MaxLowerOrEqual(arr1, 2));
        System.out.println(MaxLowerOrEqual(arr1, 15));
        System.out.println(MaxLowerOrEqual(arr1, -4));
        System.out.println(MaxLowerOrEqual(arr1, 134));
    }

    public static int MaxLowerOrEqual(int[] sortedArr, int value) {
//  Сначала проверим, существует ли искомый элемент
        if (sortedArr[0] > value)
            return -1;
        int leftIndex = 0;
        int rightIndex = sortedArr.length;
        int midIndex;

        while ((leftIndex + 1) < rightIndex) {
            midIndex = (leftIndex + rightIndex) / 2;
            if (sortedArr[midIndex] <= value)
                leftIndex = midIndex;
            else
                rightIndex = midIndex;

        }
        return leftIndex;
    }
}
