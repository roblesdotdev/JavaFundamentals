package poo.inheritance;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        TravelTicket trainTicket = new TrainTicket();
        trainTicket.reschedule();
        trainTicket.cancel();

        TrainTicket trainTicket1 = new TrainTicket(123L, "London", "Edinburgh", new BigDecimal("59.0"),
                LocalDateTime.of(2023, 3, 7, 16, 44),
                LocalDateTime.of(2023, 3, 7, 17, 30),
                1, 3, 42);

        trainTicket1.upgrade();

        String[] providers = {"First bus company", "Second bus company"};
        BusTicket busTicket = new BusTicket(123L, "London", "Edinburgh", new BigDecimal("59.0"),
                LocalDateTime.of(2023, 3, 7, 16, 44),
                LocalDateTime.of(2023, 3, 7, 17, 30),
                providers);

        busTicket.cancel();

    }
}
