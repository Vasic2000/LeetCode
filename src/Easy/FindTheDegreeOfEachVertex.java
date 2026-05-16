package Easy;
//TASK.3898


public class FindTheDegreeOfEachVertex {
    public static void main(String[] args) {
        int[][] matrix1 = {{0,1,1}, {1,0,1}, {1,1,0}};
        int[][] matrix2 = {{0,1,0},{1,0,0},{0,0,0}};
        int[][] matrix3 = {{0}};

        printArray(findDegrees(matrix1));
        printArray(findDegrees(matrix2));
        printArray(findDegrees(matrix3));

    }

    public static int[] findDegrees(int[][] matrix) {
        int[] ans = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                ans[i] = ans[i] + matrix[i][j];
            }
        }
        return ans;
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
