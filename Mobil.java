
public class Mobil {
    private int id;
    private String tipe;
    private double harga;
    private int stok;

    public Mobil(int id, String tipe) {
        this.id = id;
        this.tipe = tipe;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public String getTipe() {
        return tipe;
    }
}


