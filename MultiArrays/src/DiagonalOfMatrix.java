public class DiagonalOfMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
                {1,1,1},
                {1,1,1},
                {1,1,1}
        };
        System.out.println(diagonalSum(matrix));
    }

    static int diagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }
}
