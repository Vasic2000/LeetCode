package Easy;
//Task.605

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int[] flowerbed2 = {1, 0, 1, 0, 1};
        int[] flowerbed3 = {1, 0, 0, 0, 1};
        int[] flowerbed4 = {0, 0, 1, 0, 0};
        int[] flowerbed5 = {0, 0, 0, 0, 1};
        int[] flowerbed6 = {0, 0, 0, 0, 1};
        int[] flowerbed7 = {0};
        int[] flowerbed8 = {1};
        int[] flowerbed9 = {0,1};

        printArray(flowerbed1);
        System.out.println("1 flower " + canPlaceFlowers(flowerbed1, 1));
        System.out.println();
        printArray(flowerbed2);
        System.out.println("1 flower " + canPlaceFlowers(flowerbed2, 1));
        System.out.println();
        printArray(flowerbed3);
        System.out.println("2 flowers " + canPlaceFlowers(flowerbed3, 2));
        System.out.println();
        printArray(flowerbed4);
        System.out.println("2 flowers " + canPlaceFlowers(flowerbed4, 2));
        System.out.println();
        printArray(flowerbed5);
        System.out.println("2 flowers " + canPlaceFlowers(flowerbed5, 2));
        System.out.println();
        printArray(flowerbed6);
        System.out.println("3 flowers " + canPlaceFlowers(flowerbed6, 3));
        System.out.println();
        printArray(flowerbed7);
        System.out.println("1 flower " + canPlaceFlowers(flowerbed7, 1));
        System.out.println();
        printArray(flowerbed8);
        System.out.println("1 flower " + canPlaceFlowers(flowerbed8, 1));
        System.out.println();
        printArray(flowerbed9);
        System.out.println("1 flower " + canPlaceFlowers(flowerbed9, 1));
        System.out.println();
        printArray(flowerbed9);
        System.out.println("0 flower " + canPlaceFlowers(flowerbed9, 0));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        //Corner case of 0..1 length
        if(flowerbed.length == 0) return false;
        if((flowerbed.length == 1) && (flowerbed[0] == 0)) {
            flowerbed[0] = 1;
            n--;
        }

        //Left corner case
        if ((flowerbed[0] == 0) && (flowerbed[1] == 0)) {
            flowerbed[0] = 1;
            n--;
        }

        int current = 1;

        while (current < flowerbed.length - 1) {
            if ((flowerbed[current - 1] == 0) && (flowerbed[current] == 0) && (flowerbed[current + 1] == 0)) {
                flowerbed[current] = 1;
                n--;
                current++;
            }
            current++;
        }

        //Right corner case
        if ((flowerbed[flowerbed.length - 1] == 0) && (flowerbed[flowerbed.length - 2] == 0)) {
            flowerbed[flowerbed.length - 1] = 1;
            n--;
        }

        if (n <= 0)
            return true;
        return false;
    }

    public static void printArray(int[] nums) {
        short i = 1;
        if(nums != null)
            System.out.print(nums[0]);
        while(i < nums.length) {
            System.out.print(";" + nums[i]);
            i++;
        }
        System.out.println();
    }
}