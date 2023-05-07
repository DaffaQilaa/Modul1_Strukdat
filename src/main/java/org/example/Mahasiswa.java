package org.example;
import java.io.*;
import java.util.*;

public class Mahasiswa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Daftar Mahasiswa");
            System.out.println("2. Login");
            System.out.println("0. Keluar");

            System.out.print("Masukkan pilihan Anda: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    daftarMahasiswa();
                    break;
                case 2:
                    login();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }

        } while (choice != 0);

        input.close();

    }

    public static void daftarMahasiswa() {

        Scanner input = new Scanner(System.in);

        System.out.print("\nMasukkan nama mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        System.out.print("Masukkan jurusan: ");
        String jurusan = input.nextLine();

        try {
            FileWriter writer = new FileWriter("mahasiswa.txt", true);
            writer.write(nama + "," + nim + "," + password + "," + jurusan + "\n");
            writer.close();

            System.out.println("\nData mahasiswa berhasil ditambahkan.");

        } catch (IOException e) {
            System.out.println("\nTerjadi kesalahan saat menulis file.");
            e.printStackTrace();
        }

    }

    public static void login() {

        Scanner input = new Scanner(System.in);

        System.out.print("\nMasukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        try {
            File file = new File("mahasiswa.txt");
            Scanner reader = new Scanner(file);

            boolean found = false;

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] dataArray = data.split(",");

                if (dataArray[1].equals(nim) && dataArray[2].equals(password)) {
                    System.out.println("\nLogin berhasil. Selamat datang, " + dataArray[0] + ".");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("\nLogin gagal. NIM atau password yang Anda masukkan salah.");
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("\nFile tidak ditemukan.");
            e.printStackTrace();
        }

    }

}