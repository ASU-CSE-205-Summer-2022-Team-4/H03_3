public class H03_31 {

    // public int sum1toN(int n) {
    // int sum = 0;
    // for (int i = 1; i <= n; i++) {
    // sum += i;
    // }
    // return sum;
    // }
    public int sum1toN(int n) {
        if (n == 1)
            return 1;
        return sum1toN(n--);
    }

}