public class FindTheFine {
    public static void main(String[] args) {

    }

    public long totalFine(int date, int[] car, int[] fine) {
        // code here
        boolean isEven = date % 2 == 0;
        int sum = 0;
        for (int i = 0; i < car.length; i++) {
            if (isEven) {
                if (car[i] % 2 != 0) {
                    sum += fine[i];
                }
            } else {
                if (car[i] % 2 == 0) {
                    sum += fine[i];
                }
            }
        }
        return sum;
    }
}
