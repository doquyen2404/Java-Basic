package Day1;

public class StringTest {
    public static void main(String[] args) {
        String txt = "Hello World";

        System.out.println(txt);
        System.out.println(txt.substring(7));
        System.out.println(txt.substring(1,5) );
        System.out.println(txt.substring(txt.length()-3, txt.length()));
    }
}
