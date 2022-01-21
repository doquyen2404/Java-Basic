package Day3;

public class MultiplicationTable {
    public static void main(String[] args) {
        int a = 4;
        for (int b = 1; b <= 10; ++b) {
            System.out.printf("%d * %d = %d \n", a, b, a * b);
        }
    }
}
