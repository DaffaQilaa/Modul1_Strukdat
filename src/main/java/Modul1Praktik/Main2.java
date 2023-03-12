package Modul1Praktik;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai alas: ");
        double alas = scanner.nextDouble();

        System.out.print("Masukkan nilai tinggi: ");
        double tinggi = scanner.nextDouble();

        Segitiga<Double> segitiga = new Segitiga<>(alas, tinggi);

        System.out.println("Pilih salah satu operasi:");
        System.out.println("1. Hitung luas");
        System.out.println("2. Hitung keliling");
        System.out.println("3. Hitung luas piramida");
        System.out.println("4. Hitung volume piramida");

        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Luas segitiga (double) = " + segitiga.getResultAsDouble());
                System.out.println("Luas segitiga (integer) = " + segitiga.getResultAsInt());
                break;
            case 2:
                // There is no concept of perimeter in a triangle, perhaps you meant to say "Keliling"
                double keliling = alas + tinggi + Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
                System.out.println("Keliling segitiga (double) = " + keliling);
                System.out.println("Keliling segitiga (integer) = " + (int) keliling);
                break;
            case 3:
                System.out.print("Masukkan tinggi piramida: ");
                double tinggiPiramida = scanner.nextDouble();
                double luasPiramida = segitiga.getResultAsDouble() * tinggiPiramida / 3;
                System.out.println("Luas piramida (double) = " + luasPiramida);
                System.out.println("Luas piramida (integer) = " + (int) luasPiramida);
                break;
            case 4:
                System.out.print("Masukkan tinggi piramida: ");
                tinggiPiramida = scanner.nextDouble();
                double volumePiramida = segitiga.getResultAsDouble() * tinggiPiramida / 3;
                System.out.println("Volume piramida (double) = " + volumePiramida);
                System.out.println("Volume piramida (integer) = " + (int) volumePiramida);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}
