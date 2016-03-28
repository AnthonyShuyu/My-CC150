/**
* If an element of M*N matrix is 0, set the entire row and column to 0
*
*/

// use two arraylists, T = O(n^2)

public static int[][] setZero(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
        return matrix;
    }
    if (matrix[0] == null || matrix[0].length == 0) {
        return matrix;
    }

    Set<Integer> rows = new HashSet<Integer>();
    Set<Integer> columns = new HashSet<Integer>();

    int m = matrix.length;
    int n = matrix[0].length;

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (matrix[i][j] == 0) {
                if (!rows.contains(i)) {
                    rows.add(i);
                }
                if (!columns.contains(j)) {
                    columns.add(j);
                }
            }
        }
    }

    for (int i : rows) {
        for (int j = 0; j < n; j++) {
            matrix[i][j] = 0;
        }
    }
    for (int j : columns) {
        for (int i = 0; i < m; i++) {
            matrix[i][j] = 0;
        }
    }
    return matrix;
}

// or the last two for loops can be replaced by this 2 level for loops

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (rows.contains(i) || columns.contains(j)) {
                matrix[i][j] = 0;
            }
        }
    }

// test

public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[][] matrix = new int[][]{{1,2,3},{0,3,5},{3,0,5}};
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j]);
        }
        System.out.println();
    }
    int[][] newMatrix = setZero(matrix);

    for (int i = 0; i < newMatrix.length; i++) {
        for (int j = 0; j < newMatrix[0].length; j++) {
            System.out.print(newMatrix[i][j]);
        }
        System.out.println();
    }

    Set<Integer> set = new HashSet<Integer>();
    set.add(1);
    set.add(2);
    for (int i : set) {
        System.out.println(i);
    }

}
