import java.util.Arrays;

public class STFloorCeil {

    public static void main(String[] args){
        int[] nums = {3, 4, 4, 7, 8, 10};
        System.out.println(Arrays.toString(optimal(nums, 8)));
    }


    static int[] optimal(int[] nums, int x){
        int n=nums.length;
        int floor=-1;
        int ceil = -1;

        int low =0;
        int high = n-1;

        while(low<=high){
            int mid = low+(high- low)/2;
            if(nums[mid]<=x){
                floor=nums[mid];
                low = mid+1;
            }else{
                high = mid-1;
            }
        }


        low =0;
        high = n-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(nums[mid]>=x){
                ceil = nums[mid];
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return new int[]{floor, ceil};
    }




}
