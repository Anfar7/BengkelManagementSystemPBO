public class Kendaraan {
    private String merk;
    private String model;
    private String nomorPlat;

    public Kendaraan(String merk, String model, String nomorPlat) {
        this.merk = merk;
        this.model = model;
        this.nomorPlat = nomorPlat;
    }

    public String getMerk() { return merk; }
    public String getModel() { return model; }
    public String getNomorPlat() { return nomorPlat; }

    @Override
    public String toString() {
        return "Kendaraan: " + merk + " " + model + " - Plat: " + nomorPlat;
    }
}
