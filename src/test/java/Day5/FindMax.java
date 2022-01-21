package Day5;

public class FindMax {
    public static void main(String[] args) {
        int[] marks = {3, 53453, 3453, 453, 343};
        int max = 0;
        for (int i = 0; i < marks.length-1; i++) {
            int temp = Math.max(marks[i], marks[i+1]);
            max = Math.max(temp, max);
        }
        System.out.println(max);
    }
}
