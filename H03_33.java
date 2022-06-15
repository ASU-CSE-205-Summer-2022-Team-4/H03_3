public class H03_33 {
    public double powerFaster(double x, int n){
            if (n == 0)
                return 1;
            if(n % 2 != 0){
                return x * (powerFaster(x, n - 1));
            } else {
                n = (n / 2) ;
                //23^6
                //6/2 = 3
                //23^3 = 12167
                //12167^2 = 148035889
                return x * 2;
            }
    }
}
