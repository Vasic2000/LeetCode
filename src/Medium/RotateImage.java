package Medium;

public class RotateImage {

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        printMatrix(matrix1);
        rotate(matrix1);
        System.out.println();
        printMatrix(matrix1);

        System.out.println();

        int[][] matrix2 = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};

        printMatrix(matrix2);
        rotate(matrix2);
        System.out.println();
        printMatrix(matrix2);

        System.out.println();

        int[][] matrix3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};

        printMatrix(matrix3);
        rotate(matrix3);
        System.out.println();
        printMatrix(matrix3);

    }

    private static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] matrix) {
        int zero;
        for(int i = 0; i < matrix.length / 2 ; i++) { // i - строка, j - столбец
            for(int j = i; j < matrix.length - i-1; j++) {

//                int lt = matrix[i][j];
//                int ll = matrix[matrix.length - j - 1][i];
//                int lr = matrix[matrix.length - i - 1][matrix.length - j - 1];
//                int tr = matrix[j][matrix.length - i - 1];

                zero = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - j - 1][i];
                matrix[matrix.length - j - 1][i] = matrix[matrix.length - i - 1][matrix.length - j - 1];
                matrix[matrix.length - i - 1][matrix.length - j - 1] = matrix[j][matrix.length - i - 1];
                matrix[j][matrix.length - i - 1] = zero;
            }
        }
    }
}
