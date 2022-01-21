package Day5;

public class FindMin {
   public static void main(String[] args) {
       int[] marks = {34353, 567, 8789, 653438};
       int min = marks[0];
       for (int i = 0; i < marks.length-1; i++) {
           min = Math.min(marks[i], min);
       }
       System.out.println(min);
    }
}
