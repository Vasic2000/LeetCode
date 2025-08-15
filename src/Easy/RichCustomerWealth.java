package Easy;

public class RichCustomerWealth {

    public static void main(String[] args) {
        int[][] accounts1 = {{1,2,3},{3,2,1}};
        int[][] accounts2 = {{1,5},{7,3},{3,5}};
        int[][] accounts3 = {{2,8,7},{7,1,3},{1,9,5}};
        int[][] accounts4 = {{2,8,7,2},{7,4,1,3},{1,9,3,5},{5,9,9,9}};

        System.out.println(maximumWealth(accounts1));
        System.out.println(maximumWealth(accounts2));
        System.out.println(maximumWealth(accounts3));
        System.out.println(maximumWealth(accounts4));
    }

    private static int maximumWealth(int[][] accounts) {
        int realMax = 0;
        int max;
        int m = accounts.length;
        int n = accounts[0].length;
        for (int i = 0; i < m; i++) {
            max = 0;
            for (int j = 0; j < n; j++) {
                max+= accounts[i][j];
            }
            if(max > realMax) {
                realMax = max;
            }
        }
        return realMax;
    }
}
