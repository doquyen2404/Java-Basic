package Day5;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 6, 7, 9, 11};
        getMissingNumber(numbers, 11);
    }

    private static void getMissingNumber(int[] numbers, int length) {
        int missingCount = length - numbers.length;
        BitSet bitSet = new BitSet(length);
        for (int number : numbers) {
            bitSet.set(number - 1);
        }
        int lastMissingIndex = 0;
        System.out.printf("Missing number in integer array %s, with total number %d is: ", Arrays.toString(numbers), length);
        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }
}
