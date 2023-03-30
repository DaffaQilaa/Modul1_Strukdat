package Modul2Praktik;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int data) {
        Node new_node = new Node(data);
        if (this.head == null) {
            this.head = new_node;
            return;
        }
        if (new_node.data < this.head.data) {
            new_node.next = this.head;
            this.head = new_node;
            return;
        }
        Node current_node = this.head;
        while (current_node.next != null && current_node.next.data < new_node.data) {
            current_node = current_node.next;
        }
        new_node.next = current_node.next;
        current_node.next = new_node;
    }

    public void printListBeforeSort() {
        Node current_node = this.head;
        System.out.print("sebelum : ");
        while (current_node != null) {
            System.out.print(current_node.data + " ");
            current_node = current_node.next;
        }
        System.out.println();
    }

    public void printListAfterSort() {
        Node current_node = this.head;
        System.out.print("setelah : ");
        while (current_node != null) {
            System.out.print(current_node.data + " ");
            current_node = current_node.next;
        }
        System.out.println();
    }
}
