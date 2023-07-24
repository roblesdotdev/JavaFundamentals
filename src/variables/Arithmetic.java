package variables;

public class Arithmetic {
    public static void main(String[] args) {
        int first = 50;
        int second = 25;
        int third = 33;

        int expected = first / second;
        System.out.println("The result of 50 / 25 is " + expected);

        expected = first / third;
        System.out.println("The result of 50 / 33 is " + expected);

        System.out.println("Be careful with int divisions. Result is truncated.");

        // cast the numerator to double -> (double)
        double expectedD = (double) first / third;
        System.out.println("The result of (double) 50 / 33 is " + expectedD);

        System.out.printf("And formatted is %.2f\n", expectedD);

        int count = 0;
        count += 1;
        count--;
        count += 2;
        count++;
        count += 5;
        count -= 4;
        System.out.println("The result the count is " + count);  // 4
    }
}
