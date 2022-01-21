package Day2;

import java.util.Scanner;

public class OddAndEven2 {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        i = scanner.nextInt();
        if (i % 2 == 0) {
            System.out.println(i + " is even number");
        } else {
            System.out.println(i + " is odd number");
        }
    }
}
