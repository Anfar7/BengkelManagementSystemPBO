import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bengkel bengkel = new Bengkel();
        boolean running = true;

        while (running) {
            System.out.println("\n=== Sistem Manajemen Bengkel ===");
            System.out.println("1. Tambah Kendaraan dan Pelanggan");
            System.out.println("2. Tambah Riwayat Servis");
            System.out.println("3. Tampilkan Riwayat Servis");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    // Input data kendaraan dan pelanggan
                    System.out.print("Jenis Kendaraan (Mobil/Motor): ");
                    String jenisKendaraan = scanner.nextLine();

                    System.out.print("Merk: ");
                    String merk = scanner.nextLine();
                    System.out.print("Model: ");
                    String model = scanner.nextLine();
                    System.out.print("Nomor Plat: ");
                    String nomorPlat = scanner.nextLine();

                    Kendaraan kendaraan;
                    if (jenisKendaraan.equalsIgnoreCase("Mobil")) {
                        System.out.print("Bahan Bakar: ");
                        String bahanBakar = scanner.nextLine();
                        kendaraan = new Mobil(merk, model, nomorPlat, bahanBakar);
                    } else {
                        System.out.print("Kapasitas Mesin (cc): ");
                        int kapasitasMesin = scanner.nextInt();
                        scanner.nextLine();
                        kendaraan = new Motor(merk, model, nomorPlat, kapasitasMesin);
                    }

                    System.out.print("Nama Pelanggan: ");
                    String namaPelanggan = scanner.nextLine();
                    System.out.print("Kontak Pelanggan: ");
                    String kontakPelanggan = scanner.nextLine();
                    Pelanggan pelanggan = new Pelanggan(namaPelanggan, kontakPelanggan);

                    bengkel.tambahPelangganDanKendaraan(pelanggan, kendaraan);
                    System.out.println("Kendaraan dan pelanggan berhasil ditambahkan!");
                    break;

                case 2:
                    // Input data riwayat servis
                    System.out.print("Nomor Plat Kendaraan untuk Servis: ");
                    String platServis = scanner.nextLine();
                    Kendaraan kendaraanServis = bengkel.cariKendaraanByPlat(platServis);

                    if (kendaraanServis != null) {
                        System.out.print("Tanggal Servis (dd-mm-yyyy): ");
                        String tanggalServis = scanner.nextLine();

                        // Tambah layanan dalam riwayat servis
                        RiwayatServis riwayatServis = new RiwayatServis(kendaraanServis, tanggalServis);
                        boolean tambahLayanan = true;

                        while (tambahLayanan) {
                            System.out.print("Nama Layanan: ");
                            String namaLayanan = scanner.nextLine();
                            System.out.print("Biaya Layanan: ");
                            int biaya = scanner.nextInt();
                            scanner.nextLine();

                            Layanan layanan = new LayananTambahan(namaLayanan, biaya);
                            riwayatServis.tambahLayanan(layanan);

                            System.out.print("Tambah layanan lain? (y/n): ");
                            tambahLayanan = scanner.nextLine().equalsIgnoreCase("y");
                        }

                        bengkel.tambahRiwayatServis(riwayatServis);
                        System.out.println("Riwayat servis berhasil ditambahkan!");
                    } else {
                        System.out.println("Kendaraan tidak ditemukan.");
                    }
                    break;

                case 3:
                    // Tampilkan seluruh riwayat servis
                    bengkel.tampilkanRiwayatServis();
                    break;

                case 4:
                    // Keluar
                    running = false;
                    System.out.println("TERIMA KASIH TELAH MENGGUNAKAN LAYANAN KAMI!");
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid, Silahkan Coba Lagi.");
            }
        }

        scanner.close();
    }
}
