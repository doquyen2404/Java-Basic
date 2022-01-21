package Day5;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int [][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}, {8, 9, 10}};
        int [] mang1 = {1, 2, 3, 4};
        int [] mang2 = {5, 6, 7};

        System.out.println(mang1[0]);
        System.out.println(mang2[0]);

       // int x = myNumbers[2][1];
       // System.out.println(x);

        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
