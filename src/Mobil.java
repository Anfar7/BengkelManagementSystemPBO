public class Mobil extends Kendaraan {
    private String bahanBakar;

    public Mobil(String merk, String model, String nomorPlat, String bahanBakar) {
        super(merk, model, nomorPlat);
        this.bahanBakar = bahanBakar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bahan Bakar: " + bahanBakar;
    }
}

