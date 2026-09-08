import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {

    public static void main(String[] args) {
        int[] nums = {12,2,3,31,1};
        System.out.println(better(nums,3));
    }

    static int better(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            maxHeap.offer(num);

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }
}
