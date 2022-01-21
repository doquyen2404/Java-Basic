package Day1;

import javax.sound.midi.Soundbank;

public class HelloWorld {
    public static void main(String[] args) {
        String txt = "Hello World";

        System.out.println(txt);
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.length());
        System.out.println(txt.substring(5));
        System.out.println(txt.substring(2,5));
        System.out.println(txt.substring(txt.length()-2, txt.length()));
    }
}
