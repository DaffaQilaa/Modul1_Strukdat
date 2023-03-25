package Modul2Latihan;
import java.util.ArrayList;
public class Main3 {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");

        ArrayList<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");

        Link link = new Link();
        for (String h : hewan) {
            link.add(h);
        }

        System.out.println("Hewan :");
        for (String h : hewan) {
            System.out.print(h + " ");
        }
        System.out.println();

        System.out.println("Hewan yang dihapus:");
        for (String h : deleteHewan) {
            System.out.print(h + " ");
        }
        System.out.println();

        System.out.println("Output Hewan:");
        for (String h : deleteHewan) {
            link.remove(h);
        }
        link.print();
    }
}

