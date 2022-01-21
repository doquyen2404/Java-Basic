package Day2;

import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        num1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        num2 = scanner.nextInt();
        System.out.println("Enter number 3: ");
        num3 = scanner.nextInt();
        if( num1 >= num2 && num1 >= num3)
            System.out.println(num1+" is Max!!");

        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2+" is Max!!");
        else
            System.out.println(num3+" is Max!!");
    }
}
