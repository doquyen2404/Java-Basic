package Day1;

public class Test03 {
    private boolean compare(int a, int b) {
        if (((a - b) * (-1) + Math.abs((a - b))) == 0) {
            return false;
        }
        return true;
    }
}
