import java.util.ArrayList;

public class FirstAndLastInSorted {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        System.out.println(secondApproach(nums, 5));
    }


    //Time Complexity -> O(n) Space Complexity -> O(n)
    static ArrayList<Integer> secondApproach(int[] nums, int x) {
        int n = nums.length;

        int leftIdx = -1;
        int rightIdx = -1;

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            if (nums[start] == x && leftIdx == -1) {
                leftIdx = start;
            }

            if (nums[end] == x && rightIdx == -1) {
                rightIdx = end;
            }

            start++;
            end--;
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(leftIdx);
        list.add(rightIdx);

        return list;
    }


    //Time Complexity -> O(n) Space Complexity -> O(n)
    static ArrayList<Integer> firstApproach(int[] nums, int x) {

        int n = nums.length;
        int leftIdx = -1;
        int rightIdx = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == x) {
                leftIdx = i;
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == x) {
                rightIdx = i;
                break;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        list.add(leftIdx);
        list.add(rightIdx);

        return list;

    }
}
