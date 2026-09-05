import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums){
        int n= nums.length;
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && nums[j-1]>nums[j]){
                int temp = nums[j-1];
                nums[j-1]=nums[j];
                nums[j]=temp;
                j--;
            }
        }
    }
}
