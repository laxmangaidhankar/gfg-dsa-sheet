public class Replace0With5 {

    public static void main(String[] args) {
        int num = 10002;
        System.out.println(replace(num));
    }


    static int replace(int num) {
        int result = 0;
        int place = 1;

        while (num > 0) {
            int digit = num % 10;

            if (digit == 0) {
                digit = 5;
            }

            result = result + digit * place;
            num = num / 10;
            place = place * 10;
        }


    return result;}
}
