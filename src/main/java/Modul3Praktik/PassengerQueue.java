package Modul3Praktik;
import java.util.Scanner;

public class PassengerQueue {
    private Node front;
    private Node rear;
    private int size;

    private class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public PassengerQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(String passengerName) {
        Node newNode = new Node(passengerName);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(passengerName + " telah ditambahkan ke dalam queue.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong.");
            return;
        }
        String passengerName = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.println(passengerName + " telah dikeluarkan dari antrian.");
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Penumpang kosong.");
            return;
        }
        System.out.println("Penumpang yang berada di depan queue adalah " + front.data + ".");
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        PassengerQueue queue = new PassengerQueue();
        Scanner input = new Scanner(System.in);

        int pilihan = 0;

        while (pilihan != 5) {
            System.out.println("Pilih operasi yang akan dilakukan:");
            System.out.println("1. Tambah penumpang ke dalam queue");
            System.out.println("2. Keluarkan penumpang dari depan queue");
            System.out.println("3. Lihat penumpang yang berada di depan queue");
            System.out.println("4. Lihat Jumlah Penumpang");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama penumpang: ");
                    String name = input.next();
                    queue.enqueue(name);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    System.out.println("Jumlah Penumpang: " + queue.size());
                    break;
                case 5:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

            System.out.println();
        }

        input.close();
    }
}
