import java.util.Arrays;

public class TransformArrayInPlace {

    public static void main(String[] args) {
        int[] nums = {4, 0, 2, 1, 3};
        optimal(nums);
        System.out.println(Arrays.toString(nums));
    }



    static void optimal(int[] nums){
        int n= nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]+ (nums[nums[i]]%n)*n;
        }

        for(int i=0;i<n;i++){
            nums[i]=nums[i]/n;
        }


    }

    //Brute Force -> Extra Array
    //Tc -> O(n)
    //SC -> O(n)
    static void brute(int[] nums) {

        int n = nums.length;
        int[] temp = new int[n];
        int k = 0;
        for (int num : nums) {
            temp[k++] = num;
        }


        for (int i = 0; i < n; i++) {
            nums[i] = temp[temp[i]];
        }

    }
}
