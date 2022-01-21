package Day5;

public class Polidrome {
    public static void main(String[] args) {
        CheckPa("mom");
    }
    public static void CheckPa(String s) {
        String re = "";
        for (int i = s.length()-1; i >= 0;  i--) {
            re = re + s.charAt(i);
        }
        if (re.equals(s)) {
            System.out.println(s + " is a Polidrome");
        }
        else {
            System.out.println(s + " is not a Polidrome");
        }
    }
}
