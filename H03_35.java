/** CSE205 Object Oriented Programming and Data Structures, Summer 2022 C-Session
 Homework 3
 Group 4
 AUTHOR: David McConnell  dmcconn7    dmcconn7@asu.edu
 AUTHOR: Lia Moua         amoua       amoua@asu.edu
 AUTHOR: Arsal Akhtar     akakhta2    akakhta2@asu.edu
 AUTHOR: Kari McBride     kemcbri2    kemcbri2@asu.edu
 */

public class H03_35 {
    public String reverse(String s){
        if(s.length() == 0) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
