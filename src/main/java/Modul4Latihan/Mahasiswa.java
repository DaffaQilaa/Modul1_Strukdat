package Modul4Latihan;

import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Mahasiswa(String nm, String kl, String mat, int ni) {
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Ilham", "3H", "Struktur Data", 2020000));
        mhs.put("2", new Mahasiswa("Fathin", "3A", "Matematika", 2020012));
        mhs.put("3", new Mahasiswa("Arro", "3D", "Pemograman", 2020017));

        System.out.print("masukkan ID : ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null) {
            System.out.println("Data Mahasiswa : " + data.nama + ", kelas : " + data.kelas + ", mata kuliah : "
                    + data.matkulPraktikum + ", NIM : " + data.nim);
        }
    }
}
