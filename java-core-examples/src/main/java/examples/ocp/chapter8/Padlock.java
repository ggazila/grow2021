package examples.ocp.chapter8;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Padlock {
    private Lock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        var gate = new Padlock();
        for (int i = 0; i < 5; i++) {
            new Thread(() -> gate.lockUp()).start();
            Thread.sleep(100);
        }
    }

    public void lockUp() {
        if (lock.tryLock()) {
            lock.lock();
            System.out.println("Locked!");
            lock.unlock();
        }
    }
}
