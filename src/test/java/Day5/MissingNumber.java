package Day5;
import java.util.Arrays;
public class MissingNumber {
        public static void main(String[] args) {
            int[] numbers = new int[]{1, 2, 3, 4, 6, 7, 8, 9, 10, 11};
            System.out.printf("Missing number in array %s is %d", Arrays.toString(numbers), getMissingNumber(numbers, 11));
        }
        private static int getMissingNumber(int[] numbers, int length) {
            int expectedSum = length * (length + 1) / 2;
            int actualSum = 0;
            for (int i : numbers) {
                actualSum += i;
            }
            return expectedSum - actualSum;
        }
    }
