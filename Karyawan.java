import java.util.List;

class Karyawan {
    private String nama;
    private String idKaryawan;

    public Karyawan(String nama, String idKaryawan) {
        this.nama = nama;
        this.idKaryawan = idKaryawan;
    }

    public void tambahHarga(Mobil mobil, double harga) {
        mobil.setHarga(harga);
    }

    public void lihatPembeli(List<Pembeli> pembeli) {
        for (Pembeli p : pembeli) {
            System.out.println("Pembeli: " + p.getNama());
        }
    }
}