public class H03_35 {
    public String reverse(String s){
        if(s.isEmpty()) return s;
        //ello + h
        //llo + eh
        //lo + leh
        //o + lleh
        //olleh
        System.out.println("what is s: " + s);

        return reverse(s.substring(1) + s.charAt(0));
    }
}
