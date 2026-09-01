import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayLeaders {

    public static void main(String[] args) {
        int[] nums = {16, 17, 4, 3, 5, 2};
        System.out.println(Arrays.toString(optimal(nums)));
    }


    //O(n) O(n)
    static int[] optimal(int[] nums){
        int n= nums.length;
        int max= nums[n-1];
        int[] temp = new int[n];
        int k=0;
        temp[k++]=max;

        for(int i=n-2;i>=0;i--){
            if(nums[i]>max){
                temp[k++]=nums[i];
                max=nums[i];
            }
        }
        for (int i = 0; i < k / 2; i++) {
            int swap = temp[i];
            temp[i] = temp[k - 1 - i];
            temp[k - 1 - i] = swap;
        }
        return Arrays.copyOf(temp,k);
    }

    //O(n^2) O(n)
    static int[] bruteApproach(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (!(nums[i] > nums[j])) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                temp[k++] = nums[i];
            }
        }
        return temp;
    }
}
