public class SumOfMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 1, 0, 1},
                {0, 1, 0, 1, 0},
                {-1, -1, -1, -1, -1}
        };
        System.out.println(sumOfMatrixSimple(matrix));
    }


    //Time Complexity -> O(n*m) Space Complexity -> O(1)
    static int sumOfMatrixSimple(int[][] matrix) {

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }


    //Brute Force Time Complexity -> O(n*m) Space Complexity -> O(n*m)
    static int sumOfMatricBrute(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] ans = new int[rows * cols];

        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[k++] = matrix[i][j];
            }
        }

        int sum = 0;
        for (int i = 0; i < ans.length; i++) {
            sum += ans[i];
        }

        return sum;
    }
}
