package Day1;

public class DaysOfWeek2 {
    public static void main(String[] args) {
        int day = 1;
        printDate_IfElse(5);
    }

    public static void printDate_IfElse(int day) {
        String message = "Invalid Date";
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println(message);
        }
    }
}
