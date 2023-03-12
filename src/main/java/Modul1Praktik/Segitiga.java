package Modul1Praktik;

public class Segitiga<T extends Number> {
    private T tinggi;
    private T alas;

    public T getAlas() {
        return alas;
    }

    public T getTinggi() {
        return tinggi;
    }

    public Segitiga(T alas, T tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getResultAsInt() {
        return (int) (0.5 * alas.doubleValue() * tinggi.doubleValue());
    }

    public double getResultAsDouble() {
        return 0.5 * alas.doubleValue() * tinggi.doubleValue();
    }
}
