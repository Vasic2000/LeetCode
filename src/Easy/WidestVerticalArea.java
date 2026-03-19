package Easy;
//Task.1637
//Widest Vertical Area Between Two Points Containing No Points

import java.util.ArrayList;

public class WidestVerticalArea {
    public static void main(String[] args) {
        int [][] points1 = {{8,7},{9,9},{7,4},{9,7}};
        int [][] points2 = {{3,1},{9,0},{1,0},{1,4},{5,3},{8,8}};

        System.out.println(maxWidthOfVerticalArea(points1));
        System.out.println(maxWidthOfVerticalArea(points2));
    }

    private static int maxWidthOfVerticalArea(int[][] points) {
        ArrayList<Integer> y_cords = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            y_cords.add(points[i][0]);
        }
        y_cords.sort(null);

        int result = 0;
        for (int i = 1; i < points.length; i++) {
            if(result < (y_cords.get(i) - y_cords.get(i-1))) {
                result = y_cords.get(i) - y_cords.get(i-1);
            }
        }

        return result;
    }
}
