public class LongestSubarraywithGCDOne {

    public static void main(String[] args) {
        int[] nums = {1,2,4,6};
        System.out.println(optimal(nums));
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    //O(n log (M)) O(1)
    static int optimal(int[] nums){
        int n = nums.length;
        int maxLen=-1;
        int overallGCD = 0;
        for(int num:nums){
            overallGCD = gcd(overallGCD,num);
            if(overallGCD == 1){
                return n;
            }

        }

        return overallGCD==1?n:-1;
    }


    //O(n^2 log(M)) O(1)
    static int brute(int[] nums) {
        int n = nums.length;
        int maxLen = -1;
        for (int i = 0; i < n; i++) {

            int currGCD = 0;
            for (int j = i; j < n; j++) {
                currGCD = gcd(currGCD, nums[j]);
                if(currGCD==1) {
                    maxLen = Math.max(maxLen, j-i+1);
                }
            }
        }
        return maxLen;
    }
}
