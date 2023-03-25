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
        System.out.println("Program operasi segitiga");
        System.out.println("========================");
        System.out.println("Pilih salah satu operasi:");
        System.out.println("1. Hitung luas dan keliling segitiga");
        System.out.println("2. Hitung luas dan volume limas segiempat");
        System.out.println("3. Hitung luas dan volume limas segitiga");

        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Luas segitiga (double) = " + segitiga.getResultAsDouble());
                System.out.println("Luas segitiga (integer) = " + segitiga.getResultAsInt());
                double keliling = alas + tinggi + Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
                System.out.println("Keliling segitiga (double) = " + keliling);
                System.out.println("Keliling segitiga (integer) = " + (int) keliling);
                break;
            case 2:
                System.out.print("Masukkan tinggi limas: ");
                double tinggiPiramida = scanner.nextDouble();
                tinggiPiramida = scanner.nextDouble();
                double luasPiramida = segitiga.getResultAsDouble() * tinggiPiramida / 3;
                System.out.println("Luas limas segiempat (double) = " + luasPiramida);
                System.out.println("Luas limas segiempat (integer) = " + (int) luasPiramida);
                double volumePiramida = segitiga.getResultAsDouble() * tinggiPiramida / 3;
                System.out.println("Volume limaas segiempat (double) = " + volumePiramida);
                System.out.println("Volume limas segiempat (integer) = " + (int) volumePiramida);
                break;
            case 3:
                System.out.print("Masukkan tinggi limas: ");
                double tinggiLimas = scanner.nextDouble();
                double luasLimas = segitiga.getResultAsDouble() * tinggiLimas / 3;
                System.out.println("Luas limas segitiga (double) = " + luasLimas);
                System.out.println("Luas limas segitiga (integer) = " + (int) luasLimas);
                double volumeLimas = segitiga.getResultAsDouble() * tinggiLimas / 3;
                System.out.println("Volume limas segitiga (double) = " + volumeLimas);
                System.out.println("Volume limas segitiga (integer) = " + (int) volumeLimas);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}
