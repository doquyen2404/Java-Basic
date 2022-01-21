package Day5;

public class Average {
    public static void main(String[] args) {
        double[] array = {3, 5, 7, 3, 7, 12};
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        double average = total / array.length;
        System.out.println("Result is " + average);
        }
    }
