package Modul1Latihan;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Konsumsi> listKonsumsi = new ArrayList<>();
        Konsumsi<Makanan, Minuman> sarapan = new Konsumsi<>();
        Konsumsi<Makanan, Minuman> lunch = new Konsumsi<>();

        Makanan roti = new Makanan();
        roti.setNamaHidangan("roti Kapas");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("susu putih");
        sarapan.setKonsumsi(roti, susu);
        listKonsumsi.add(sarapan);

        Makanan ayam = new Makanan();
        ayam.setNamaHidangan("ayam bakar");
        Minuman es = new Minuman();
        es.setNamaHidangan("es jeruk");
        lunch.setKonsumsi(ayam, es);
        listKonsumsi.add(lunch);

        System.out.println("makanan konsumsi");
        for (Konsumsi<Makanan, Minuman> konsumsi : listKonsumsi) {
            Makanan makanan = konsumsi.getM();
            Minuman minuman = konsumsi.getI();

            System.out.println(makanan.dimakan());
            System.out.println(minuman.dimakan());
        }
    }
}
