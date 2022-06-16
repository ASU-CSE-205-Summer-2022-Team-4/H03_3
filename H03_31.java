/** CSE205 Object Oriented Programming and Data Structures, Summer 2022 C-Session
 Homework 3

 Group 4
 AUTHOR: David McConnell  dmcconn7    dmcconn7@asu.edu
 AUTHOR: Lia Moua         amoua       amoua@asu.edu
 AUTHOR: Arsal Akhtar     akakhta2    akakhta2@asu.edu
 AUTHOR: Kari McBride     kemcbri2    kemcbri2@asu.edu
 */

public class H03_31 {
    public int sum1toN(int n) {
        if (n == 1) return 1;
        return sum1toN(n-1) + n;
    }
}