import java.util.ArrayList;

public class Bengkel {
    private ArrayList<RiwayatServis> riwayatServisList = new ArrayList<>();
    private ArrayList<Kendaraan> kendaraanList = new ArrayList<>();

    public void tambahPelangganDanKendaraan(Pelanggan pelanggan, Kendaraan kendaraan) {
        kendaraanList.add(kendaraan);
    }

    public Kendaraan cariKendaraanByPlat(String plat) {
        for (Kendaraan k : kendaraanList) {
            if (k.getNomorPlat().equalsIgnoreCase(plat)) {
                return k;
            }
        }
        return null;
    }

    public void tambahRiwayatServis(RiwayatServis servis) {
        riwayatServisList.add(servis);
    }

    public void tampilkanRiwayatServis() {
        for (RiwayatServis servis : riwayatServisList) {
            System.out.println(servis);
        }
    }
}


