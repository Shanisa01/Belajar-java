public class PembeliIndividu extends Pembeli {
    private double diskon;
    private Mobil mobil;
    private int jumlah;

    public PembeliIndividu(int id, String nama, double diskon) {
        super(id, nama);
        this.diskon = diskon;
    }

    public void beliMobil(Mobil mobil, int jumlah) {
        this.mobil = mobil;
        this.jumlah = jumlah;
    }

    @Override
    public double hitungTotal() {
        if (mobil != null) {
            return mobil.getHarga() * jumlah * (1 - diskon);
        }
        return 0;
    }
}

