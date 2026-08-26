import java.util.List;

public class WhoHasTheMajority {

    public static void main(String[] args) {

    }

    public int moreFrequent(List<Integer> nums, int x, int y) {
        // code here
        int xCount = 0;
        int yCount = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == x) {
                xCount++;
            }
            if (nums.get(i) == y) {
                yCount++;
            }
        }


        if (xCount == yCount) {
            return Math.min(x, y);
        }

        return xCount > yCount ? x : y;
    }
}
