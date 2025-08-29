package EASY;

//Task.3000

public class MaximumAreaOfLongestDiagonalRectangle {
    public static void main(String[] args) {
        int[][] dim1 = {{9,3},{8,6}};
        int[][] dim2 = {{3,4},{4,3}};
        int[][] dim3 = {{91,12},{4,2},{15,2}};
        int[][] dim4 = {{31,15},{42,2},{100,100}};
        int[][] dim5 = {{10,3},{5,9},{8,3}};

        System.out.println(areaOfMaxDiagonal(dim1));
        System.out.println(areaOfMaxDiagonal(dim2));
        System.out.println(areaOfMaxDiagonal(dim3));
        System.out.println(areaOfMaxDiagonal(dim4));
        System.out.println(areaOfMaxDiagonal(dim5));
    }

    public static int areaOfMaxDiagonal(int[][] dimensions) {
        int diag2 = 0;
        int shape = 0;
        int MaxDiag = 0;
        int MaxShape = 0;
        int MaxIndex = 0;

        for (int i = 0; i < dimensions.length; i++) {
            diag2 = dimensions[i][0]*dimensions[i][0] + dimensions[i][1]*dimensions[i][1];
            if(diag2 > MaxDiag) {
                MaxDiag = diag2;
                MaxShape = dimensions[i][0] * dimensions[i][1];
                MaxIndex = i;

            } else if(diag2 == MaxDiag) {
                shape = dimensions[i][0] * dimensions[i][1];
                if(shape > MaxShape) {
                    MaxShape = shape;
                    MaxIndex = i;
                }
            }

        }
        return dimensions[MaxIndex][0]*dimensions[MaxIndex][1];
    }
}
