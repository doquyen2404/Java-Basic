package Day5;

public class Array2 {
    public static void main(String[] args) {
        int[] marks = {1, 2, 3, 5, 7, 10};

        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks 1: " + marks[i]);
        }
        for (int a : marks) {
            System.out.println("marks 2: " + a);
        }

        int i = 0;
        while (i < marks.length) {
            System.out.println("marks 3: " + marks[i]);
            i++;
        }
        i = 0;

        do {
            System.out.println("marks 4: " + marks[i]);
            i++;
        } while (i < marks.length);
    }
}
