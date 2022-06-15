public class H03_31 {

    // public int sum1toN(int n) {
    // int sum = 0;
    // for (int i = 1; i <= n; i++) {
    // sum += i;
    // }
    // return sum;
    // }

    public int sum1toN(int n) {
        if (n == 1) return 1;

        return sum1toN(n-1) + n;
    }
//sum1ToN(5) = 5+4+3+2+1 = 15
    //5 , sum1ToN(4)
}