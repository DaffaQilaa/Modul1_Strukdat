package Modul3Latihan2;

public class QueueMain {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue("Java");
        queue.enqueue("DotNet");
        queue.enqueue("PHP");
        queue.enqueue("HTML");
        System.out.println("dequeue : " + queue.dequeue());
        System.out.println("peek : " + queue.peek());
        System.out.println("dequeue : " + queue.dequeue());
        System.out.println("peek : " + queue.peek());
    }
}
