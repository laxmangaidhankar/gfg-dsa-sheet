public class SetkthBit {


    public static void main(String[] args) {
        int n = 4;
        System.out.println(optimal(n, 2));
    }


    //O(1) O(1)
    static int optimal(int n, int k){
        return n | (1 << k);
    }



    //O(log n) O(log n)
    static int better(int n, int k) {
        StringBuilder binary = dec2binary(n);

        if (binary.isEmpty()) {
            return n;
        }

        binary.setCharAt(binary.length() - 1 - k, '1');

        return Integer.parseInt(binary.toString(), 2);
    }

    static StringBuilder dec2binary(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            if (n % 2 == 1)
                sb.append(1);
            else
                sb.append(0);

            n >>= 1;
        }

        return sb.reverse();
    }
}
