package Day1;

public class Arithmetic {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        int add = x + y;
        System.out.println("x " + "+ " + "y = " + add);

        int sub = x - y;
        System.out.println("x " + "- " + "y = " + sub);

        int multi = x * y;
        System.out.println("x " + "* " + "y = " + multi);

        int divide = x / y;
        System.out.println("x " + "/ " + "y = " + divide);

        int a = 3;

        System.out.println(++a);
        System.out.println(a);

        System.out.println(a++);
        System.out.println(a);

        System.out.println(--a);
        System.out.println(a);

        System.out.println(a--);
        System.out.println(a);
    }
}

