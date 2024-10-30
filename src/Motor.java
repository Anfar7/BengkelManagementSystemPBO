public class Motor extends Kendaraan {
    private int kapasitasMesin;

    public Motor(String merk, String model, String nomorPlat, int kapasitasMesin) {
        super(merk, model, nomorPlat);
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public String toString() {
        return super.toString() + ", Kapasitas Mesin: " + kapasitasMesin + "cc";
    }
}
