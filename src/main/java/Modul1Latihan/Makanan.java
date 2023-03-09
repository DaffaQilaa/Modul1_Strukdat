package Modul1Latihan;

public class Makanan extends Hidangan {
    @Override
    public String dimakan() {
        return this.getNamaHidangan() + " dimakan";
    }
}
