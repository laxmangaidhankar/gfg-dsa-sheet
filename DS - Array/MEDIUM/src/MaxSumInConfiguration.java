public class MaxSumInConfiguration {

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 8};
        System.out.println(bruteForce(nums));
    }


    static int bruteForce(int[] nums){
        int n=nums.length;
        int maxSum=Integer.MIN_VALUE;
        for(int r=0;r<n;r++){
            int sum =0;

            for(int i=0;i<n;i++){
                sum+=i*nums[i];
            }

            maxSum = Math.max(maxSum, sum);

            int last = nums[n-1];

            for(int i=n-1;i>0;i--){
                nums[i]=nums[i-1];
            }

            nums[0]=last;

        }
        return maxSum;
    }



    //o(n) O(1)

    static int brute(int[] nums) {
        int n = nums.length;
        int k = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i] * k;
            k++;
        }

        return sum;
    }
}
