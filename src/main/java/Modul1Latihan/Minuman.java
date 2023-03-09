package Modul1Latihan;

public class Minuman extends Hidangan {
    @Override
    public String dimakan() {
        return this.getNamaHidangan() + " diminum";
    }
}
