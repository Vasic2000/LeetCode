package Easy;
//TASK.1572 Matrix Diagonal Sum

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat2 = {{1,1,1,1},{1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        int[][] mat3 = {{1,1},{1,1}};
        int[][] mat4 = {{7}};

        System.out.println(diagonalSum(mat1));
        System.out.println(diagonalSum(mat2));
        System.out.println(diagonalSum(mat3));
        System.out.println(diagonalSum(mat4));
    }

    private static int diagonalSum(int[][] mat) {
        int i = 0;
        int result = 0;

        while(i < mat.length) {
            if(i != mat.length - 1 - i) {
                result += mat[i][i];
                result += mat[mat[0].length -1 - i][i];
                i++;
            }  else {
                result += mat[i][i];
                i++;
            }
        }
        return result;
    }
}
