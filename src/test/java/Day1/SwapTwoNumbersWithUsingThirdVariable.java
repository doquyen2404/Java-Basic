package Day1;

public class SwapTwoNumbersWithUsingThirdVariable {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("Enter a: " + a);
        System.out.println("Enter b: " + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
