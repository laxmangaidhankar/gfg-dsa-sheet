import java.util.Arrays;

public class FirstMissing {


    public static void main(String[] args){

    int[] nums= {2, -3, 4, 1, 1, 7};
        System.out.println(brute(nums));

    }




    public static int brute(int[] nums){
        Arrays.sort(nums);
        int n=nums.length;
        int k=0;

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                if(k==0 || nums[i]!=nums[k]){
                    nums[k++]=nums[i];
                }
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return n+1;


    }
}
