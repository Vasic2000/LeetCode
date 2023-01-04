package Easy;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image = new int[][] {{1,1,1,1,0}, {1,1,1,0,2}, {1,1,2,2,4}, {2,3,0,4,5}, {2,4,4,4,5}};

        printImage(image);
        printImage(floodFill(image, 1,1, 7));

        int[][] image2 = new int[][] {{1,2,2,2,2,6}, {1,1,2,2,2,6}, {1,1,2,2,4,2}, {2,3,2,2,5,6}, {2,2,4,4,5,1}};

        printImage(image2);
        printImage(floodFill(image2, 3,1, 7));

        int[][] image3 = new int[][] {{1}, {1}};

        printImage(image3);
        printImage(floodFill(image3, 0,0, 7));
    }

    private static void printImage(int[][] image) {
        for(int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                System.out.print(image[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] redraw = image;
        int changedColor = redraw[sr][sc];
        redraw[sr][sc] = color;
        recolorNeighbors(redraw, sr,sc, color, changedColor);
        return image;
    }

    private static void recolorNeighbors(int[][] redraw, int row, int column, int color, int changedColor) {
            if(isRecolorable(redraw, row, column - 1, changedColor)) {
                redraw[row][column - 1] = color;
                recolorNeighbors(redraw, row,column - 1, color, changedColor);
            }
            if(isRecolorable(redraw, row - 1, column, changedColor)) {
                redraw[row - 1][column] = color;
                recolorNeighbors(redraw, row - 1,column, color, changedColor);
            }
            if(isRecolorable(redraw, row, column + 1, changedColor)) {
                redraw[row][column + 1] = color;
                recolorNeighbors(redraw, row,column + 1, color, changedColor);
            }
            if(isRecolorable(redraw, row + 1, column, changedColor)) {
                redraw[row + 1][column] = color;
                recolorNeighbors(redraw, row + 1,column, color, changedColor);
            }
        }

    private static boolean isRecolorable(int[][] redraw, int row, int column, int changedColor) {
        if((column < 0) || (column > redraw[0].length - 1)) return false;
        if((row < 0) || (row > redraw.length - 1)) return false;
        if(redraw[row][column] != changedColor) return false;
        return true;
    }
}
