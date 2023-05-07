package Modul3Praktik;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan string: ");
        String str = input.nextLine();
        String reversedStr = reverseString(str);
        System.out.println("String yang dibalik: " + reversedStr);
    }

    public static String reverseString(String str) {
        int length = str.length();
        Stack stack = new Stack(length);

        for (int i = 0; i < length; i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder reversedStr = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = stack.pop();
            reversedStr.append(c);
        }
        return reversedStr.toString();
    }
}

class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char c) {
        if (isFull()) {
            System.out.println("Stack penuh, push gagal!");
            return;
        }
        stackArray[++top] = c;
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong, pop gagal!");
            return '\0';
        }
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

