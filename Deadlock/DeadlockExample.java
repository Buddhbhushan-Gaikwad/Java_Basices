package Deadlock;

public class DeadlockExample {

    public static void main(String[] args) {
        final Object resource1 = "Order-Lock";
        final Object resource2 = "Payment-Lock";

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: locked Order");
                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (resource2) {
                    System.out.println("Thread 1: locked Payment");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: locked Payment");
                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (resource1) {
                    System.out.println("Thread 2: locked Order");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

