package Day1;

public class TestCar {
    public static void main(String[] args) {
        Car BWM = new Car();
        BWM.license = "ABC";
        BWM.door = "4";
        BWM.engine = "abc";
        BWM.seat = "4";
        BWM.wheel = "4";

        System.out.println("BWM: ");

        System.out.println(BWM.license);
        System.out.println(BWM.door);
        System.out.println(BWM.engine);
        System.out.println(BWM.seat);
        System.out.println(BWM.wheel);

        Car Mercedes = new Car();
        Mercedes.license = "DEF";
        Mercedes.door = "4";
        Mercedes.engine = "def";
        Mercedes.seat = "4";
        Mercedes.wheel = "4";

        System.out.println("Mercedes: ");

        System.out.println(Mercedes.license);
        System.out.println(Mercedes.door);
        System.out.println(Mercedes.engine);
        System.out.println(Mercedes.seat);
        System.out.println(Mercedes.wheel);
    }
}
