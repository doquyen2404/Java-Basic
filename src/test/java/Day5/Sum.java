package Day5;

public class Sum {
    public static void main(String[] args) {
        int[] mang1 = {14, 56, 34, 68, 35};
        int sum = 0;
        for (int num : mang1) {
            sum = sum + num;
        }
        System.out.println("Sum: " + sum);
    }
}
