package Modul4Praktik;
import java.util.HashMap;
import java.util.Scanner;
public class DataPraktikan {
    private HashMap<String, String> tabelData;
    private HashMap<String, String> tabelSesiLogin;

    public DataPraktikan() {
        tabelData = new HashMap<>();
        tabelSesiLogin = new HashMap<>();
    }

    public boolean tambahData(String nimPraktikan, String namaAsisten) {
        if (!nimPraktikan.matches("IF")) {
            return false;
        }
        if (tabelData.containsKey(nimPraktikan)) {
            return false;
        }
        tabelData.put(nimPraktikan, namaAsisten);
        return true;
    }

    public void tampil() {
        System.out.println("Data Praktikan:");
        for (String nimPraktikan : tabelData.keySet()) {
            String namaAsisten = tabelData.get(nimPraktikan);
            System.out.println(nimPraktikan + "\t" + namaAsisten);
        }
    }

    public void listNimPraktikan() {
        System.out.println("NIM Praktikan:");
        for (String nimPraktikan : tabelData.keySet()) {
            System.out.println(nimPraktikan);
        }
    }

    public int totalEmail() {
        return tabelData.size();
    }

    public boolean hapusData(String nimPraktikan, String namaAsisten) {
        if (!tabelData.containsKey(nimPraktikan)) {
            return false;
        }
        if (!tabelData.get(nimPraktikan).equals(namaAsisten)) {
            return false;
        }
        tabelData.remove(nimPraktikan);
        return true;
    }

    public void editData(String nimPraktikan, String namaAsisten) {
        if (tabelData.containsKey(nimPraktikan)) {
            tabelData.put(nimPraktikan, namaAsisten);
            System.out.println("Data berhasil diubah.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

    public boolean login() {
        Scanner input = new Scanner(System.in);
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();

        if (!tabelSesiLogin.containsKey(email) || !tabelSesiLogin.get(email).equals(password)) {
            System.out.println("Gagal Login");
            return false;
        }

        if (!email.endsWith("@umm.ac.id")) {
            System.out.println("Email tidak valid.");
            return false;
        }

        System.out.println("Selamat datang!");
        return true;
    }

    public void logout() {
        System.out.println("Anda berhasil logout.");
    }

    public static void main(String[] args) {
        DataPraktikan data = new DataPraktikan();
        Scanner input = new Scanner(System.in);
        boolean isLoggedIn = false;

        while (true) {
            System.out.println("================================");
            System.out.println("Aplikasi Data Praktikan");
            System.out.println("================================");
            System.out.println("1. Login");
            System.out.println("2. Tambah Data Praktikan");
            System.out.println("3. Tampilkan Data Praktikan");
            System.out.println("4. List NIM Praktikan");
            System.out.println("5. Total Email");
            System.out.println("6. Hapus Data Praktikan");
            System.out.println("7. Edit Data Praktikan");
            System.out.println("8. Logout");

            if (isLoggedIn) {
                System.out.println("Masukkan pilihan Anda (2-7): ");
            } else {
                System.out.println("Masukkan pilihan Anda (1 atau 8): ");
            }

            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    // Login
                    // Tambahkan kode untuk Login sesuai spesifikasi pada kegiatan sebelumnya
                    break;
                case 2:
                    if (isLoggedIn) {
                        System.out.println("Masukkan NIM Praktikan: ");
                        String nim = input.next();
                        System.out.println("Masukkan Nama Asisten: ");
                        String nama = input.next();
                        boolean result = data.tambahData(nim, nama);
                        if (result) {
                            System.out.println("Data berhasil ditambahkan");
                        } else {
                            System.out.println("Data gagal ditambahkan");
                        }
                    } else {
                        System.out.println("Silakan login terlebih dahulu");
                    }
                    break;
                case 3:
                    if (isLoggedIn) {
                        data.tampil();
                    } else {
                        System.out.println("Silakan login terlebih dahulu");
                    }
                    break;
                case 4:
                    if (isLoggedIn) {
                        data.listNimPraktikan();
                    } else {
                        System.out.println("Silakan login terlebih dahulu");
                    }
                    break;
                case 5:
                    if (isLoggedIn) {
                        System.out.println("Total email: " + data.totalEmail());
                    } else {
                        System.out.println("Silakan login terlebih dahulu");
                    }
                    break;
                case 6:
                    if (isLoggedIn) {
                        System.out.println("Masukkan NIM Praktikan yang akan dihapus: ");
                        String nim = input.next();
                        System.out.println("Masukkan Nama Asisten: ");
                        String nama = input.next();
                        boolean result = data.hapusData(nim, nama);
                        if (result) {
                            System.out.println("Data berhasil dihapus");
                        } else {
                            System.out.println("Data gagal dihapus");
                        }
                    } else {
                        System.out.println("Silakan login terlebih dahulu");
                    }
                    break;
                case 7:
                    if (isLoggedIn) {
                        System.out.println("Masukkan NIM Praktikan yang akan diedit: ");
                        String nim = input.next();
                        System.out.println("Masukkan Nama Asisten: ");
                        String nama = input.next();
                        data.editData(nim, nama);
                    } else {
                        System.out.println("Silakan login terlebih dahulu");
                    }
                    break;
                case 8:
                    if (!isLoggedIn) {
                        System.out.println("Anda belum login");
                        break;
                    }
                    System.out.println("Anda telah keluar dari program");
                    isLoggedIn = false;
                    break;

                default:
                    System.out.println("Input tidak valid, silahkan coba lagi");
                    break;
            }
        }
    }
}
