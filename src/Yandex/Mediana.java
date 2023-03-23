package Yandex;

public class Mediana {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 4, 5};
        int[] arr2 = new int[]{1, 4, 8, 2};
        int[] arr3 = new int[]{6, 8, 2, 4, 12};

        System.out.println(mediana(arr1));
        System.out.println(mediana(arr2));
        System.out.println(mediana(arr3));
    }

    private static int mediana(int[] arr) {
        sortArray(arr);
        return arr[arr.length/2];
    }

    private static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
    }

}
