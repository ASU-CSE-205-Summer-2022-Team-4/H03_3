public class H03_33 {
    /** CSE205 Object Oriented Programming and Data Structures, Summer 2022 C-Session
     Homework 3

     Group 4
     AUTHOR: David McConnell  dmcconn7    dmcconn7@asu.edu
     AUTHOR: Lia Moua         amoua       amoua@asu.edu
     AUTHOR: Arsal Akhtar     akakhta2    akakhta2@asu.edu
     AUTHOR: Kari McBride     kemcbri2    kemcbri2@asu.edu
     */

    public double powerFaster(double x, int n){
            if (n == 0)
                return 1;
            if(n % 2 != 0){
                return x * (powerFaster(x, n - 1));
            } else {
                //23^6
                //6/2 = 3
                //23^3 = 12167
                //12167^2 = 148035889
                //int powerNum = n / 2;
                double prod = Math.pow(x,n/2);
                double result = Math.pow(prod,2);
                return result;
            }
    }
}
