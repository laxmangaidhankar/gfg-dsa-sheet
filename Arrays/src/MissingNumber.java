public class MissingNumber {

    public static void main(String[] args) {

        int[] nums = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(optimalSolution(nums));
    }


    static int optimalSolution(int[] nums) {
        int xor1 = 0;

        for (int i = 1; i <= nums.length + 1; i++) {
            xor1 = xor1 ^ i;
        }

        int xor2 = 0;

        for (int i = 0; i < nums.length - 1 + 1; i++) {
            xor2 = xor2 ^ nums[i];
        }

        return xor1 ^ xor2;
    }

    static int optimalApproach(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        long expSum = n * (n + 1) / 2;

        return (int) (expSum - sum);


    }


    //SC -> O(n) SC-> O(n)
    static int betterApproach(int[] nums) {
        int n = nums.length;

        int[] hash = new int[n + 1];

        for (int i = 0; i < n - 1; i++) {
            hash[nums[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        return -1;
    }


    //TC -> O(n*n) SC -> O(1)
    static int bruteForce(int[] nums) {
        int n = nums.length;
        for (int i = 1; i <= n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - 1; j++) {
                if (nums[j] == i) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return i;
            }
        }

        return -1;
    }
}
