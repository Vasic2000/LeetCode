package Easy;
//Task.3668

public class RestoreFinishingOrder {
    public static void main(String[] args) {

        int[] order1 = {3,1,2,5,4};
        int[] friends1 = {1,3,4};
        printArray(recoverOrder(order1, friends1));

        int[] order2 = {1,4,5,3,2};
        int[] friends2 = {2,5};
        printArray(recoverOrder(order2, friends2));

        int[] order3 = {3,9,1,2,7,8,6,5,4};
        int[] friends3 = {1,3,9,7,4};
        printArray(recoverOrder(order3, friends3));
    }

    public static int[] recoverOrder(int[] order, int[] friends) {
        int[] result = new int[friends.length];
        int f = 0;
        int o = 0;
        int k = 0;

        while(o < order.length) {
            while(f < friends.length) {
                if(order[o] == friends[f]) {
                    result[k] = friends[f];
                    k++;
                    f = friends.length;
                }
                f++;
            }
            f = 0;
            o++;
        }
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
