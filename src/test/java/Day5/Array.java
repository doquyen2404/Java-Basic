package Day5;

public class Array {
    public static void main(java.lang.String[] args) {
        java.lang.String car = "BWM";
        java.lang.String car2 = "Volvo";
        java.lang.String car3 = "Vin fast";

        java.lang.String[] cars = {"BWM", "Volvo", "Vin fast", "Ford", "Mazda"};
        System.out.println(cars[0]);
        System.out.println(cars.length - 1);

        cars[0] = "Honda";
        System.out.println(cars[0]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println("car 5: " + cars[i]);
            System.out.println("car 6: ".concat(cars[i]));
            System.out.printf("car 7: %s \n" , cars[i]);
        }

            for (int i = 0; i < cars.length; i++) {
                if(cars[i].equalsIgnoreCase("Honda")) {
                    System.out.println("car1: " + cars[i]);
                }
            }
            for (java.lang.String str : cars) {
                if(str.equalsIgnoreCase("Honda"))
                    System.out.println("car2: " + str);
            }
            int i = 0;
            while (i < cars.length) {
                System.out.println("car3: " + cars[i]);
                i++;
            }
            int j = 0;
            do {
                System.out.println("car4: " + cars[j]);
                j++;
            } while (j < cars.length);
        }
    }