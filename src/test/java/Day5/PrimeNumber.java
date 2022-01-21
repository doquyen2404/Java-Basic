package Day5;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N:");
        int N = Integer.parseInt(input.nextLine());
        int[] t = new int[N];
        int[] temp = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Enter index " + (i + 1) + " :");

            t[i] = Integer.parseInt(input.nextLine());
        }
        int k = 0;
        for (int i = 0; i < t.length; i++) {

            Boolean flag = true;

            for (int j = 2; j < t[i]; j++) {

                if (t[i] % j == 0) {
                    flag = false;
                }
            }
            if (flag == true) {

                temp[k] = t[i];
            }
            k += 1;
        }
        t = new int[k];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0) {
                t[i] = temp[i];
            }
        }
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i] > t[j]) {
                    int te;
                    te = t[i];
                    t[i] = t[j];
                    t[j] = te;
                }
            }
        }
        System.out.println("Prime Numbers are ");
        for (int i = 0; i < t.length; i++) {
            if(t[i] != 0){
                System.out.println(t[i]);
            }
        }
    }
}
