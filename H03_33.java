public class H03_33 {
    public double powerFaster(double x, int n){
            if (n == 0)
                return 1;
            if(n % 2 != 0){
                return x * (powerFaster(x, n - 1));
            } else {
                n = n /2;
                return x * (powerFaster(x, n - 1)) * 2;
            }
    }
}
