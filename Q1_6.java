/**
* rotate an N*N matrix by 90 degrees
*
*/

// T = O(n^2)

public static int[][] rotateImage(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
        return null;
    }
    if (matrix[0] == null || matrix[0].length == 0) {
        return null;
    }

    int n = matrix.length;
    int m = matrix[0].length;
    if (n != m) {
        return null;
    }

    int[][] ary = new int[n][n];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            ary[j][n - 1 - i] = matrix[i][j];
        }
    }
    return ary;
}


// test

public static void main(String[] args) {
    int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j]);
        }
        System.out.println();
    }
    int[][] newMatrix = rotateImage(matrix);

    for (int i = 0; i < newMatrix.length; i++) {
        for (int j = 0; j < newMatrix[0].length; j++) {
            System.out.print(newMatrix[i][j]);
        }
        System.out.println();
    }

}
