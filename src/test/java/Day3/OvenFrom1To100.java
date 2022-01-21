package Day3;

public class OvenFrom1To100 {
    public static void main(String[] args) {
        int number = 2;
        System.out.println("Oven numbers from 1 to 100 are: ");
        while (number <= 100 && number%2 == 0){
            System.out.println(number);
            number+=2;
        }
    }
}
