public class SearchinSortedMatrix {

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {13, 23, 25},
        };

        System.out.println(optimal(mat, 1));
    }

    static boolean optimal(int[][] mat, int x){
        int n = mat.length;
        int m = mat[0].length;

        int low =0;
        int high = n*m-1;

        while(low<=high){
            int mid = low+(high -low)/2;

            int row = mid/m;
            int col = mid%m;

            if(mat[row][col]==x){
                return true;
            }else if(mat[row][col]<x){
                low =mid+1;
            }else{
                high =mid-1;
            }
        }
        return false;
    }




    static boolean better(int[][] mat, int x) {

        for (int i = 0; i < mat.length; i++) {
            boolean isPresent = binarySearch(mat[i], x);

            if (isPresent) {
                return true;
            }
        }
        return false;
    }


    static boolean binarySearch(int[] mat, int x) {
        int low = 0;
        int high = mat.length - 1;

        while (low <= high) {
            int mid = low + (high - low);

            if (mat[mid] == x) {
                return true;
            } else if (mat[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    static boolean brute(int[][] mat, int x) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    return true;
                }
            }
        }
        return false;
    }
}
