package Day5;

import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        System.out.println("Enter numbers of index: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] array = new double[n];
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter value for index "+(i+1)+": ");
            array[i] = scanner.nextDouble();
        }
        scanner.close();
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        System.out.format("Result: %.3f", total);

    }
}
