package Easy;
//TASK.463 Island Perimeter

public class IslandPerimetr {
    public static void main(String[] args) {
        int[][] map1 = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int[][] map2 = {{1}};
        int[][] map3 = {{1,0}};
        int[][] map4 = {{0,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,1,1,1},{0,1,1,1,0,0},{1,1,1,1,1,1},{0,0,0,0,0,0}};
        int[][] map5 = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

        System.out.println(islandPerimeter(map1));
        System.out.println(islandPerimeter(map2));
        System.out.println(islandPerimeter(map3));
        System.out.println(islandPerimeter(map4));
        System.out.println(islandPerimeter(map5));
    }

    private static int islandPerimeter(int[][] grid) {
//       i - row
//       j - column
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                result += checkForNeighbours(grid, i,j);
            }
        }
        return result;
    }

    private static int checkForNeighbours(int[][] grid, int i, int j) {
//       i - row
//       j - column
        int perimetr = 0;

        if(grid[i][j] == 0)
            return perimetr;
        else {
            //Сосед сверху
            if(i == 0) {
                perimetr++;
            } else if(grid[i-1][j] == 0) {
                perimetr++;
            }

            //Сосед снизу
            if(i == grid.length - 1) {
                perimetr++;
            } else if(grid[i+1][j] == 0) {
                perimetr++;
            }

            //Сосед слева
            if(j == 0) {
                perimetr++;
            }
            else if(grid[i][j-1] == 0) {
                perimetr++;
            }

            //Сосед справа
            if(j == grid[i].length - 1) {
                perimetr++;
            }
            else if(grid[i][j+1] == 0) {
                perimetr++;
            }
        }
        return perimetr;
    }
}
