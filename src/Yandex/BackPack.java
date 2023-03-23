package Yandex;

public class BackPack {
    public static void main(String[] args) {
        int[] N = new int [] {1,2,3,4,5,6,7,8,9,10};

        int x = 10;

        int[] BackPack = findMostCapasity(N, x);
        printArr(N);
        printArr(BackPack);
    }

    private static void printArr(int[] n) {
        for(int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }

    private static int[] findMostCapasity(int[] n, int x) {
        // базовый вариант: отрицательная емкость
        if (x < 0) {
            return new int[0];
        }
        return new int[0];
    }

}
