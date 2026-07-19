package Easy;
//TASK.441 ArrangeCoins
//
//     $
//    $$
//   $$$
//  $$$$

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(8));
        System.out.println(arrangeCoins(215478));
        System.out.println(arrangeCoins(10));
    }

    private static int arrangeCoins(int n) {
        int rows = 1;
        while (n > rows) {
            n = n - rows;
            rows++;
        }
        if (n == rows)
            return rows;
        else
            return rows - 1;
    }
}
