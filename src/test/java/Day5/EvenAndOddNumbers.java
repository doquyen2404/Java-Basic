package Day5;

import java.util.Scanner;

public class EvenAndOddNumbers {
    public static void main(String[] args) {
        int i;
        int NumbersOfEven = 0;
        int NumbersOfOdd = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter numbers of index: ");
            i = scanner.nextInt();
        } while (i <= 0);

        int Array[] = new int[i];

        System.out.println("Enter index for array: ");

        for (int j = 0; j < i; j++) {
            System.out.println("Enter index " + j + ": ");
            Array[j] = scanner.nextInt();
        }
        for (int j = 0; j < i; j++) {
            if (Array[j] % 2 == 0) {
                NumbersOfEven++;
            } else {
                NumbersOfOdd++;
            }
        }
        System.out.println("Numbers of Even integers: " + NumbersOfEven);
        System.out.println("Numbers of Odd integers: " + NumbersOfOdd);
    }
}
