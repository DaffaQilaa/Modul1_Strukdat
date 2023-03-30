package Modul2Praktik;

import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<String> hewanList = new ArrayList<String>();
        hewanList.add("Angsa");
        hewanList.add("Bebek");
        hewanList.add("Cicak");
        hewanList.add("Domba");
        hewanList.add("Elang");
        hewanList.add("Gajah");

        hewanList.add("Badak");
        hewanList.add("Bebek");

        System.out.println("output pertama : " + hewanList);
        int jumlahBebek = 0;
        for (String hewan : hewanList) {
            if (hewan.equals("Bebek")) {
                jumlahBebek++;
            }
        }
        System.out.println("Jumlah elemen Bebek : " + jumlahBebek);

        int indexBebek = hewanList.indexOf("Bebek");
        System.out.println("index dari elemen Bebek : " + indexBebek);

        hewanList.remove("Bebek");
        System.out.println("output kedua : " + hewanList);

        System.out.println("Elemen pada index ke-0: " + hewanList.get(0));
        System.out.println("Elemen pada index ke-2: " + hewanList.get(2));

        System.out.println("output ketiga : " + hewanList);
        hewanList.remove(0);
        System.out.println("output keempat : " + hewanList);

        hewanList.set(0, "Ular");
        System.out.println("output kelima : " + hewanList);

        hewanList.add(2, "Itik");
        System.out.println("output keenam : " + hewanList);

        hewanList.subList(1, 5).clear();
        System.out.println("output ketujuh : " + hewanList);

        System.out.println("Elemen pertama: " + hewanList.get(0));
        System.out.println("Elemen terakhir: " + hewanList.get(hewanList.size() - 1));

        int indexBadak = hewanList.indexOf("Badak");
        System.out.println("Index dari elemen Badak: " + indexBadak);
    }
}
