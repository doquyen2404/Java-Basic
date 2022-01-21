package Day2;
import java.util.Scanner;
public class Min {
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1:");
        number1 = scanner.nextInt();
        System.out.println("Enter number 2:");
        number2 = scanner.nextInt();
        System.out.println("Enter number 3:");
        number3 = scanner.nextInt();
        if (number1 <= number2 && number1 <= number3)
            System.out.println(number1 + " is min!");
        else if (number2 <= number1 && number2 <= number3)
            System.out.println(number2 + " is min!");
        else
            System.out.println(number3 + " is min!");
    }
}
