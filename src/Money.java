import java.math.BigDecimal;

public class Money {
    public static void main(String[] args) {
        Double d = 1d;
        for (int i = 0; i < 10; i++) {
            d += 0.1;
            System.out.println(d);     // Wut!!
        }

        BigDecimal bd = BigDecimal.valueOf(1);
        for (int i = 0; i < 10; i++) {
            bd = bd.add(BigDecimal.valueOf(0.1));  //  generate new big decimal
            System.out.println(bd);
        }
    }
}
