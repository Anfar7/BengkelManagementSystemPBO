import java.util.ArrayList;

public class RiwayatServis {
    private Kendaraan kendaraan;
    private String tanggalServis;
    private ArrayList<Layanan> layananList = new ArrayList<>();

    public RiwayatServis(Kendaraan kendaraan, String tanggalServis) {
        this.kendaraan = kendaraan;
        this.tanggalServis = tanggalServis;
    }

    public void tambahLayanan(Layanan layanan) {
        layananList.add(layanan);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Tanggal Servis: " + tanggalServis + "\n" + kendaraan + "\nLayanan:\n");
        for (Layanan layanan : layananList) {
            result.append(layanan).append("\n");
        }
        return result.toString();
    }
}
