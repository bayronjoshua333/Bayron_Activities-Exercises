package Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer("Manuscript_Final.pdf");
        Printer printer2 = new Printer("Manuscript_Final_Final.pdf");

        Thread thread1 = new Thread(printer1);
        Thread thread2 = new Thread(printer2);

        thread1.setName("Thread-1");
        thread2.setName("Thread-0");

        thread1.start();
        thread2.start();

        try {
            if (thread1.isAlive()) {
                System.out.println(thread1.getName() + " status: running");
            }
            thread1.join();
            System.out.println(thread1.getName() + " status: terminated");

            if (thread2.isAlive()) {
                System.out.println(thread2.getName() + " status: running");
            }
            thread2.join();
            System.out.println(thread2.getName() + " status: terminated");

            System.out.println("Thread has ended.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
