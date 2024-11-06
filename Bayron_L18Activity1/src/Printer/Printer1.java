package Printer;

class Printer implements Runnable {
    private String documentName;

    public Printer(String documentName) {
        this.documentName = documentName;
    }

    private void printDocuments() {
        try {
            System.out.println("Printing: " + documentName);
            Thread.sleep(2000); // 2 second delay to simulate printing
            System.out.println("Finished printing: " + documentName);
        } catch (InterruptedException e) {
            System.out.println("Printing was interrupted for: " + documentName);
        }
    }

    @Override
    public void run() {
        printDocuments();
    }
}
