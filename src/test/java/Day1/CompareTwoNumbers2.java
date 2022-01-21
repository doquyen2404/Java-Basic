package Day1;

public class CompareTwoNumbers2 {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        compare(6, 9);
        compare(-5, 8);


    }

    public static void compare(int a, int b) {
        if (a < b) {
            System.out.println(b + " is Max");
        }
        if (a == b) {
            System.out.println("a and b is equal");
        }
        if (a > b) {
            System.out.println(a + " is Max");
        }
    }
}
