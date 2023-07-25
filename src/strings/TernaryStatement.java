package strings;

public class TernaryStatement {
    public static void main(String[] args) {
        String currentDay = "Friday";
        String nextDay = currentDay.equals("Friday") ? "Saturday" : "Sunday";
        System.out.println("The next day is " + nextDay);
    }
}
