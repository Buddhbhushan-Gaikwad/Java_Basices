package Deadlock;

import java.util.concurrent.locks.ReentrantLock;

public class DeadlockSafeExample {

    private static final ReentrantLock lock1 = new ReentrantLock();
    private static final ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            try {
                if (lock1.tryLock()) {
                    System.out.println("Thread 1 locked lock1");

                    Thread.sleep(100);

                    if (lock2.tryLock()) {
                        System.out.println("Thread 1 locked lock2 - work done");
                    } else {
                        System.out.println("Thread 1: Could NOT lock lock2, avoiding deadlock");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (lock1.isHeldByCurrentThread()) lock1.unlock();
                if (lock2.isHeldByCurrentThread()) lock2.unlock();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                if (lock2.tryLock()) {
                    System.out.println("Thread 2 locked lock2");

                    Thread.sleep(100);

                    if (lock1.tryLock()) {
                        System.out.println("Thread 2 locked lock1 - work done");
                    } else {
                        System.out.println("Thread 2: Could NOT lock lock1, avoiding deadlock");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (lock2.isHeldByCurrentThread()) lock2.unlock();
                if (lock1.isHeldByCurrentThread()) lock1.unlock();
            }
        });

        t1.start();
        t2.start();
    }
}
