package Day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerInput {
    public static void main(java.lang.String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            int number = scanner.nextInt();
            System.out.println(number);
            float myFloat = scanner.nextFloat();
            System.out.println(myFloat);
            double myDouble = scanner.nextDouble();
            System.out.println(myDouble);
            java.lang.String myString = scanner.next();
            System.out.println(myString);

        } catch (InputMismatchException ex) {
            System.out.println("Error InputMismatchException");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
