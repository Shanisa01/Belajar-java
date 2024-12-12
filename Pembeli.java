public abstract class Pembeli {
    protected int id;
    protected String nama;

    public Pembeli(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public abstract double hitungTotal();

    public String getNama() {
        return nama;
    }

    public void tampilkanData() {
        System.out.println("ID Pembeli: " + id + ", Nama: " + nama);
    }
}

