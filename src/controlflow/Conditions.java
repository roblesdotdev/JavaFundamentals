package controlflow;

public class Conditions {
    public static void main(String[] args) {
        ifElseCondition(100);
        ifElseCondition(80);
        ifElseCondition(50);

        switchStatement(100);
        switchStatement(70);
        switchStatement(30);
    }

    private static void ifElseCondition(int testScore) {
        if (testScore == 100) {
            System.out.println("Perfect!!!");
        } else if (testScore >= 60) {
            System.out.println("Well done - you passed");
        } else {
            System.out.println("Sorry - you failed");
        }
    }

    private static void switchStatement(int score) {
        switch (score) {
            case 100 -> System.out.println("Perfect!!!");
            case 90, 80, 70, 60 -> System.out.println("Well done - you passed");
            default -> System.out.println("Sorry - you failed");
        }
    }
}
