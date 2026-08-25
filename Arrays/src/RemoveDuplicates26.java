import java.util.HashSet;

public class RemoveDuplicates26 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(optimalApproach(nums));
    }



    //Optimal Approach Time Complexity -> O(n) Space Complexity -> O(1)
    static int optimalApproach(int[] nums){
        if (nums.length == 0) {
            return 0;
        }
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }



    //Brute Force Time Complexity -> O(n) Space Complexity -> O(n)
    static int bruteForce(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int i = 0;

        for (int num : set) {
            nums[i++] = num;
        }

        return set.size();
    }
}
