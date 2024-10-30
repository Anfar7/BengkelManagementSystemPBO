public class Pelanggan {
    private String nama;
    private String kontak;

    public Pelanggan(String nama, String kontak) {
        this.nama = nama;
        this.kontak = kontak;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Kontak: " + kontak;
    }
}
