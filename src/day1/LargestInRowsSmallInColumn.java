package day1;

public class LargestInRowsSmallInColumn {
    public static int findLargestInRowAndSmallerInColumn(int [][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
//        find largest in row
        int[] largestInRow = new int[rows];
        for (int i = 0; i < rows; i++){
            int max = matrix[i][0];
            for (int j = 1; j < cols; j++){
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
            largestInRow[i] = max;
        }

//        find smallest in column
        int[] smallestInColumn = new int[cols];
        for (int j = 0; j < cols; j++){
            int min = matrix[0][j];
            for (int i = 1; i < rows; i++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            smallestInColumn[j] = min;
        }
//        find satisfied both condition
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (matrix[i][j] == largestInRow[i] && matrix[i][j] == smallestInColumn[j]){
                    return matrix[i][j];
                }
            }
        }
//        if the condition not satisfied
        return -1;
    }
    public static void main(String[] args) {
        int [][] matrix = {
                {2,2},
                {1,2},
                {3,4}    };
        int result = findLargestInRowAndSmallerInColumn(matrix);
        System.out.println(result);
    }
}
