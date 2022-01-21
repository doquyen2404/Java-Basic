package Day5;

public class FindMax2 {
    public static void main(String[] args) {
        int[] marks = {1, 3545435, 243436, 6765, 565768, 5873, 3687, 3354};
        int max = 0;
        for (int i = 0; i < marks.length-1; i++) {
            max = Math.max(marks[i], max);
        }
        System.out.println(max);
    }
}
