package Day4;

import java.util.Locale;

public class Add2String {
    public static void main(java.lang.String[] args) {
        java.lang.String msg = "Hello World";
        java.lang.String msg2 = "ABC";

        System.out.println(msg.length());
        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());

        System.out.println(msg + msg2);
        System.out.println(msg.concat(msg2));
        System.out.println(msg.trim() + msg2.trim());

        System.out.println(msg.charAt(0));
        System.out.println(msg.charAt(msg.length()-1));
      //  System.out.println(msg.charAt(msg.length())); in ki tu thu sau cuoi cung
        System.out.println(msg.substring(1,5));


    }
}
