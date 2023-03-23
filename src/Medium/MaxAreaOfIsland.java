package Medium;

import java.util.HashSet;
import java.util.Set;

public class MaxAreaOfIsland {
    public static void main(String[] args) {
        int[][] grid0 = new int[][]{{0,1,1,0}, {0,1,1,0}, {0,0,0,0}, {0,0,0,0}};
        int[][] grid1 = new int[][]{{0,1,1,0,0}, {0,0,0,0,1}, {0,0,1,0,1}, {0,1,1,1,1}};
        int[][] grid2 = new int[][]{{0,0,1,0,0,0,0,1,0,0,0,0,0}, {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0}, {0,1,0,0,1,1,0,0,1,0,1,0,0}, {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0}, {0,0,0,0,0,0,0,1,1,1,0,0,0}, {0,0,0,0,0,0,0,1,1,0,0,0,0}};

        printMap(grid0);
        System.out.println(maxAreaOfIsland(grid0));
        System.out.println();

        printMap(grid1);
        System.out.println(maxAreaOfIsland(grid1));
        System.out.println();

        printMap(grid2);
        System.out.println(maxAreaOfIsland(grid2));
        System.out.println();
    }

    private static void printMap(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++)
                System.out.print(grid[i][j]);
            System.out.println();
        }
        System.out.println();
    }

    public static int maxAreaOfIsland(int[][] grid) {
        int maxIslandArea = 0;
        Set islands = new HashSet<Integer>();
        for(int i = 0; i < grid.length; i++)
            for(int j = 0; j < grid[i].length; j++) {
                int square = 1;
                if(grid[i][j] == 1) {
                        if(!checkIfIslandCount(i, j, islands)) {
                        islands.add(i * 100 + j);
                        square = square + checkNeborhoods(i,j, grid, square, islands);
                    }
                    maxIslandArea = Math.max(maxIslandArea, square);
                }
            }
        return maxIslandArea;
    }

    private static int checkNeborhoods(int i, int j, int[][] grid, int area, Set islands) {
        if(isAnIsland(i, j - 1, grid, islands)) {
            islands.add(i * 100 + j - 1);
            area = area + checkNeborhoods(i, j - 1, grid, area, islands);
        }
        if(isAnIsland(i - 1, j, grid, islands)) {
            islands.add((i - 1) * 100 + j);
            area = area + checkNeborhoods(i - 1, j, grid, area, islands);
        }
        if(isAnIsland(i, j + 1, grid, islands)) {
            islands.add(i * 100 + j + 1);
            area = area + checkNeborhoods(i, j + 1, grid, area, islands);
        }
        if(isAnIsland(i + 1, j, grid, islands)) {
            islands.add((i + 1) * 100 + j);
            area = area + checkNeborhoods(i + 1, j, grid, area, islands);
        }
        return area;
    }

    private static boolean isAnIsland(int i, int j, int[][] grid, Set islands) {
        if((i < 0) || (i >= grid.length) || (j < 0) || (j >= grid[i].length))
            return false;
        if(checkIfIslandCount(i, j, islands))
            return false;
        if(grid[i][j]!=1)
            return false;
        return true;
    }

    private static boolean checkIfIslandCount(int i, int j, Set islands) {
        if(islands.contains(i * 100 + j))
            return true;
        return false;
    }
}
