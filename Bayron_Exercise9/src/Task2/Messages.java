package Task2;

import java.util.LinkedList;
import java.util.Queue;

public class Messages {
    public static void main(String[] args) throws InterruptedException {
        Queue<String> messageQueue = new LinkedList<>();

        messageQueue.add("Hello");
        messageQueue.add("My name is JavaBot");
        messageQueue.add("Nice to meet you!");

        while (!messageQueue.isEmpty()) {
            String message = messageQueue.poll();  
            System.out.println("Sending message: " + message);
            Thread.sleep(1000);  
            }
    }
}
