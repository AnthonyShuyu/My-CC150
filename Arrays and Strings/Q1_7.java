/**
* If an element of M*N matrix is 0, set the entire row and column to 0
* 2 methods
*/

// Questions: Are the elements in the matrix all integers?
// Assume: Elements in the matrix are all integers


// S1: Use hashSet to save the rows and columns
// O(n^2), O(n)

public static int[][] setToZero(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
        return matrix;
    }
    if (matrix[0] == null || matrix[0].length == 0) {
        return matrix;
    }

    int m = matrix.length;
    int n = matrix[0].length;

    Set<Integer> rowSet = new HashSet<Integer>();
    Set<Integer> columnSet = new HashSet<Integer>();

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (matrix[i][j] == 0) {
                rowSet.add(i);
                columnSet.add(j);
            }
        }
    }
    for (int row : rowSet) {
    	for (int j = 0; j < n; j++) {
    		matrix[row][j] = 0;
    	}
    }

    for (int column : columnSet){
    	for (int j = 0; j < m; j++) {
    		matrix[j][column] = 0;
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


// s2: the element in the matrix will be set to 0 only if it's row or column has a 0 somewhere
// O(n^2), O(n)

public static int[][] setToZero(int[][] matrix) {
    if (matrix == null || matrix.length == 0) {
        return matrix;
    }
    if (matrix[0] == null || matrix[0].length == 0) {
        return matrix;
    }

    boolean[] rowArray = new boolean[matrix.length];
    boolean[] columnArray = new boolean[matrix[0].length];

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] == 0) {
                rowArray[i] = true;
                columnArray[j] = true;
            }
        }
    }

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (rowArray[i] || columnArray[j]) {
                matrix[i][j] = 0;
            }
        }
    }
    return matrix;
}



















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
