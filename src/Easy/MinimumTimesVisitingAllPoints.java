package Easy;
// Task.1266

public class MinimumTimesVisitingAllPoints {

    public static void main(String[] args) {
        int[][] points1 = {{1, 1}, {3, 4}, {-1, 0}};
        int[][] points2 = {{3, 2}, {-2, 2}};
        int[][] points3 = {{18, 1}, {2, 14}, {13, -21}, {15, 1}};

        System.out.println(minTimeToVisitAllPoints(points1));
        System.out.println(minTimeToVisitAllPoints(points2));
        System.out.println(minTimeToVisitAllPoints(points3));
    }


    public static int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
//        int x;
//        int y;

        int dx, dy;

        for (int i = 0; i < points.length - 1; i++) {
//            x = points[i][0];
//            y = points[i][1];
//
//            while((x!=points[i+1][0])||(y!=points[i+1][1])) {
//                if(x < points[i+1][0])
//                    x++;
//                if(x > points[i+1][0])
//                    x--;
//                if(y < points[i+1][1])
//                    y++;
//                if(y > points[i+1][1])
//                    y--;
//                result++;
//            }
//        }

            dx = Math.abs(points[i][0] - points[i + 1][0]);
            dy = Math.abs(points[i][1] - points[i + 1][1]);

            result += Math.max(dx, dy);
        }
        return result;
    }
}
