public class Layanan {
    protected String namaLayanan;
    protected int biaya;

    public Layanan(String namaLayanan, int biaya) {
        this.namaLayanan = namaLayanan;
        this.biaya = biaya;
    }

    @Override
    public String toString() {
        return namaLayanan + " - Biaya: Rp" + biaya;
    }
}

