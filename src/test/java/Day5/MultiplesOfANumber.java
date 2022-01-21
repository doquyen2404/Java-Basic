package Day5;

import java.util.Scanner;

public class MultiplesOfANumber {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter numbers of index: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int A[] = new int[n];
        System.out.println("Enter indexes for array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter index " + i + ": ");
            A[i] = scanner.nextInt();
        }
        int a = 7;
        System.out.println("Indexes divide by " + a + " is: ");
        for (int i = 0; i < n; i++) {
            if (A[i] % a == 0) {
                System.out.print(A[i] + "\t");
            }
        }
    }
}
