package Day1;

public class DaysOfWeek4 {
    public static void main(String[] args) {
        int day = 1;
        printDate_IfElse(5);
    }

    public static void printDate_IfElse(int day) {
        String message = "Invalid Date";
        switch (day) {
            case 1:
                message = "Monday";
                break;
            case 2:
                message = "Tuesday";
                break;
            case 3:
                message = "Wednesday";
                break;
            case 4:
                message = "Thursday";
                break;
            case 5:
                message = "Friday";
                break;
            case 6:
                message = "Saturday";
                break;
            case 7:
                message = "Sunday";
                break;
        }
        System.out.println(message);
    }
}