package Easy;
//TASK.1475 Final Prices With a Special Discount in a Shop
//You are given an integer array prices where prices[i] is the price of the ith item in a shop.
//There is a special discount for items in the shop. If you buy the ith item, then you will receive a discount equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i]. Otherwise, you will not receive any discount at all.
//Return an integer array answer where answer[i] is the final price you will pay for the ith item of the shop, considering the special discount.

public class FinalPricesWithASpecialDiscount {
    public static void main(String[] args) {
        int[] array1 = {8,4,6,2,3};
        int[] array2 = {1,2,3,4,5};
        int[] array3 = {10,1,1,6};
        int[] array4 = {6,2,7,4,3,2,1,1,1,1};
        printArray(finalPrices(array1));
        printArray(finalPrices(array2));
        printArray(finalPrices(array3));
        printArray(finalPrices(array4));
    }

    private static int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
        boolean discount;
        int j;
        for (int i = 0; i < prices.length - 1; i++) {
            discount = false;
            j = i + 1;
            while ((j < prices.length) && !discount) {
                if ((prices[j] <= prices[i]) && !discount) {
                    result[i] = prices[i] - prices[j];
                    discount = true;
                }
                j++;
            }
            if (!discount) {
                result[i] = prices[i];
            }
        }
        result[prices.length - 1] = prices[prices.length - 1];
        return result;
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
