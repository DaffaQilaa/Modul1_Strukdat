package Modul1Latihan;

public class Kota<E> {
    private E element;

    public Kota(E kota) {
        element = kota;
    }

    public E getElement() {
        return element;
    }

    public static void main(String[] args) {
        Kota<Integer> jumlahKota = new Kota<Integer>(10);
        Kota<String> namaKota = new Kota<String>("Ketapang");
        System.out.println("Jumlah kota di Kalimantan Barat : " + jumlahKota.getElement() + " kota");
        System.out.println("salah satu kota : Kota " + namaKota.getElement());
    }
}
