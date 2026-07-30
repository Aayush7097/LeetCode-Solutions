class Solution {

    public List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {

            // Find minimum in current row
            int minValue = matrix[i][0];
            int minCol = 0;

            for (int j = 1; j < cols; j++) {

                if (matrix[i][j] < minValue) {

                    minValue = matrix[i][j];
                    minCol = j;
                }
            }

            // Check if minimum is maximum in its column
            boolean isLucky = true;

            for (int k = 0; k < rows; k++) {

                if (matrix[k][minCol] > minValue) {

                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {

                result.add(minValue);
            }
        }

        return result;
    }
}