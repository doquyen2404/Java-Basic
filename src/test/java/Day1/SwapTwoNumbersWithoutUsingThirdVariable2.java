package Day1;

public class SwapTwoNumbersWithoutUsingThirdVariable2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("Enter a: " + a);
        System.out.println("Enter b: " + b);

        a = a - b;
        b = b + a;
        a = b - a;


        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
