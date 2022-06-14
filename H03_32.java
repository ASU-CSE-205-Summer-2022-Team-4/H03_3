public class H03_32 {

    // recursive
    public double power(double x, int n) {
        if (n == 0)
            return 1;
        x = x * n;
        return power(x, n--);
    }
    // x^n = x * x^n-1
    // 7^3 = 7 * 7^3-1 => 7 * 7^2 =>
    //
}
