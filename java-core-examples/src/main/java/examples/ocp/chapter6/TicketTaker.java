package examples.ocp.chapter6;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class TicketTaker {
    final AtomicInteger ticketsTaken;
    long ticketsSold;

    public TicketTaker() {
        ticketsSold = 0;
        ticketsTaken = new AtomicInteger(0);
    }

    public static void main(String[] args) {
        new TicketTaker().performJob();
    }

    public void performJob() {
        IntStream.iterate(1, p -> p + 1).parallel().limit(100)
                .forEach(i -> ticketsTaken.getAndIncrement());
        IntStream.iterate(1, q -> q + 1).parallel().limit(500)
                .forEach(i -> ++ticketsSold);
        System.out.println(ticketsTaken + " " + ticketsSold);

    }
}
