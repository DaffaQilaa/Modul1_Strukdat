package Modul3Latihan2;

public class MyStack {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public MyStack(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    public void push(String value) {
        if (top == maxSize - 1) {
            System.out.println(("Stack bertambah"));
            return;
        }
        top++;
        stackArray[top] = value;
    }

    public String pop() {
        if (top == -1) {
            System.out.println("Stack berkurang");
            return null;
        }
        String value = stackArray[top];
        top--;
        return value;
    }

    public String peek() {
        if ((top == -1)) {
            System.out.println("Stack kosong");
            return null;
        }
        return stackArray[top];
    }

    public boolean empty() {
        return (top == -1);
    }

    public int search(String value) {
        int index = -1;
        for (int i = top; i >= 0; i--) {
            if (stackArray[i].equals(value)) {
                index = top - i + 1;
                break;
            }
        }
        return index;
    }
}
