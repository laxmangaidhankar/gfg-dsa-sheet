public class BookAllocation {


        public static void main(String[] args){
            int[] nums = {12, 34, 67, 90};

            System.out.println(findPages(nums, 2));
        }

        public static int findPages(int[] arr, int k) {
            // Step 1: Base case
            if (k > arr.length) {
                return -1;
            }

            int max = Integer.MIN_VALUE;
            int sum = 0;
            for (int num : arr) {
                max = Math.max(max, num);
                sum += num;
            }

            int low = max;
            int high = sum;

            // Step 2 & 4: Linear search through all possible page limits
            for (int pages = low; pages <= high; pages++) {
                if (countStudents(arr, pages) <= k) {
                    return pages; // First valid allocation capacity is the answer
                }
            }

            return -1;
        }

        // Step 3: Helper function to calculate students needed for a given page capacity
        private  static int countStudents(int[] arr, int maxPagesAllowed) {
            int students = 1;
            int currentPages = 0;

            for (int num : arr) {
                if (currentPages + num > maxPagesAllowed) {
                    // Exceeds limit -> assign to a new student
                    students++;
                    currentPages = num;
                } else {
                    currentPages += num;
                }
            }

            return students;
        }
    }



