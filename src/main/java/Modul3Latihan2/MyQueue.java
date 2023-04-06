package Modul3Latihan2;

public class MyQueue {
    private Object[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        queue = new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(Object item) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        Object item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}
