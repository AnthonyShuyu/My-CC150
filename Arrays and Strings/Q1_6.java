/**
* rotate an N*N matrix by 90 degrees
* 2 methods
*/

//Ask questions: rotate left or right?
// Assume rotate left


// s1: brute force
// O(n^2), O(n^2)

public static int[][] rotateImage(int[][] image) {
    if (image == null || image.length == 0) {
        return image;
    }
    if (image[0] == null || image[0].length == 0) {
        return image;
    }
    int m = image.length;
    int n = image[0].length;

    if (m != n) {
        return image;
    }

    int[][] newImage = new int[m][m];
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < m; j++) {
            newImage[m - j - 1][i] = image[i][j];
        }
    }
    return newImage;
}



// Assume rotate right
// s2: implement the rotation in layers
// O(n^2), O(1)

public static int[][] rotateImage(int[][] image) {
    if (image == null || image.length == 0) {
        return image;
    }
    if (image[0] == null || image[0].length == 0) {
        return image;
    }
    int m = image.length;
    int n = image[0].length;

    if (m != n) {
        return image;
    }

    for (int layer = 0; layer < n/2; layer++) {
        int first = layer;
        int last = n - 1 - layer;
        for (int i = first; i < last; i++) {
            int offset = i - first;
            int top = image[first][i];    // save top
            image[first][i] = image[last - offset][first];    // left to top
            image[last - offset][first] = image[last][last - offset];   // bottom to left
            image[last][last - offset] = image[i][last];    // right to bottom
            image[i][last] = top;   // top to right
        }
    }
    return image;
}























// assume rotate left

public static int[][] rotateImage5(int[][] matrix) {
    // if...

    int n = matrix.length;

    for (int layer = 0; layer < n / 2; layer++) {
        int first = layer;
        int last = n - 1 - layer;
        for (int i = first; i < last; i++) {
            int offset = i - first;
            int top = matrix[first][i];
            matrix[first][i] = matrix[i][last];
            matrix[i][last] = matrix[last][last - offset];
            matrix[last][last - offset] = matrix[last - offset][first];
            matrix[last - offset][first] = top;
        }
    }
        return matrix;
}









public static int[][] rotateImage4(int[][] matrix) {
    // if...

    int n = matrix.length;

    for (int layer = 0; layer < n / 2; layer++) {
        int first = layer;
        int last = n - 1 - layer;
        for (int i = first; i < last; i++) {
            int offset = i - first;
            int top = matrix[first][i];
            matrix[first][i] = matrix[last - offset][first];
            matrix[last - offset][first] = matrix[last][last - offset];
            matrix[last][last - offset] = matrix[i][last];
            matrix[i][last] = top;
        }
    }
        return matrix;
}

















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
