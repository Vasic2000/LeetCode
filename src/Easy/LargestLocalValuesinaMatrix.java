package Easy;

//TASK.2373

public class LargestLocalValuesinaMatrix {
    public static void main(String[] args) {
        int[][] grid1 = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        int[][] grid2 = {{1,1,1,1,1},{1,1,1,1,1},{1,1,2,1,1},{1,1,1,1,1},{1,1,1,1,1}};

        print2Array(largestLocal(grid1));
        print2Array(largestLocal(grid2));
    }

    public static int[][] largestLocal(int[][] grid) {
        int[][] result = new int[grid.length-2][grid[0].length-2];
        for(int x = 1; x < grid.length-1; x++)
            for(int y = 1; y < grid[0].length-1; y++) {
                result[x-1][y-1] = maxValueOFF(grid[x-1][y-1], grid[x-1][y], grid[x-1][y+1], grid[x][y-1], grid[x][y], grid[x][y+1], grid[x+1][y-1], grid[x+1][y], grid[x+1][y+1]);
            }
        return result;
    }

    private static int maxValueOFF(int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int max = 0;
        if(max < i) max = i;
        if(max < i1) max = i1;
        if(max < i2) max = i2;
        if(max < i3) max = i3;
        if(max < i4) max = i4;
        if(max < i5) max = i5;
        if(max < i6) max = i6;
        if(max < i7) max = i7;
        if(max < i8) max = i8;
        return max;
    }


    private static void print2Array(int[][] ints) {
        for(int j = 0; j < ints.length; j++) {
            if (ints[j] != null)
                System.out.print(ints[j][0]);
            short i = 1;
            while (i < ints[j].length) {
                System.out.print(";" + ints[j][i]);
                i++;
            }
            System.out.println();
        }
    }
}
