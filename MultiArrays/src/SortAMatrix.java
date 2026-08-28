import java.util.Arrays;

public class SortAMatrix {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3},
                {32, 23, 34},
                {32, 2323, 1}
        };


        int[][] result = optimal(nums);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }



    //Time Complexity -> O(n × m log(n × m)) Space Complexity -> O(n × m)
    static int[][] optimal(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;


        int[] ans = new int[rows * cols];

        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[k++] = matrix[i][j];
            }
        }

        Arrays.sort(ans);

        k = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = ans[k++];
            }
        }

        return matrix;
    }


    //Brute Force Time Complexity -> O((n × m)²) Space Complexity -> O(1)
    static int[][] sortMatrix(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {

                for (int x = i; x < nums.length; x++) {
                    for (int y = 0; y < nums[x].length; y++) {
                        if (x == i && y <= j) {
                            continue;
                        }

                        if (nums[i][j] > nums[x][y]) {
                            int temp = nums[i][j];
                            nums[i][j] = nums[x][y];
                            nums[x][y] = temp;
                        }
                    }
                }
            }
        }
        return nums;
    }

}
