package Easy;
//TASK.1828 Queries on Number of Points Inside a Circle

public class QueriesOnNumberOfPointsInsideACircle {
    public static void main(String[] args) {
        int [][] points1 = {{1,3}, {3,3}, {5,3}, {2,2}};
        int [][] queries1 = {{2,3,1}, {4,3,1}, {1,1,2}};

        int [][] points2 = {{1,1},{2,2},{3,3},{4,4},{5,5}};
        int [][] queries2 = {{1,2,2}, {2,2,2}, {4,3,2}, {4,3,3}};

        int [][] points3 = {{1,3},{3,3},{5,3},{2,2},{5,2},{15,1}};
        int [][] queries3 = {{0,0,100}, {15,15,1}, {100,100,2}};

        printArray(countPoints(points1, queries1));
        printArray(countPoints(points2, queries2));
        printArray(countPoints(points3, queries3));
    }

    private static int[] countPoints(int[][] points, int[][] queries) {
        int inside;
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            inside = 0;
            for (int j = 0; j < points.length; j++) {
                if(isInSide(points[j], queries[i])) {
                    inside++;
                }
            }
            result[i] = inside;
        }
        return result;
    }

    private static boolean isInSide(int[] point, int[] query) {
        double delta = Math.sqrt((point[0]-query[0])*(point[0]-query[0]) + (point[1]-query[1])*(point[1]-query[1]));

        if(delta <= query[2])
            return true;
        else
            return false;
    }

    public static void printArray(int[] nums) {
        short i = 1;
        System.out.print("[");
        if(nums != null)
            System.out.print(nums[0]);
        while(i < nums.length) {
            System.out.print(";" + nums[i]);
            i++;
        }
        System.out.println("]");
    }
}
