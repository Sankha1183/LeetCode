class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int val = 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = val++;
            }
            for (int i = top + 1; i <= bottom; i++) {
                matrix[i][right] = val++;

            }
            if (top <= bottom && left <= right) {
                for (int i = right - 1; i >= left; i--) {
                    matrix[bottom][i] = val++;
                }
                for (int i = bottom - 1; i > top; i--) {
                    matrix[i][left] = val++;
                }
               
            }
                top++;
                bottom--;
                left++;
                right--;

        }
        return matrix;

    }
}