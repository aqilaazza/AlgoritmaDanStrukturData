public class Wahana {
    String kategori;
    String nama;
    int durasi;
    int biaya;
    static Wahana[] daftarWahana;
    static int index;
    static int totalBiayaAnak = 0;
    static int totalBiayaDewasa = 0;

    public Wahana(int kuota) {
        daftarWahana = new Wahana[kuota];
        index = 0;
    }

    public Wahana(String kategori, String nama, int durasi) {
        this.kategori = kategori;
        this.nama = nama;
        this.durasi = durasi;
        biaya = hitungBiaya();
        updateTotalBiaya();
    }

    private void updateTotalBiaya() {
        if ("anak".equalsIgnoreCase(kategori)) {
            totalBiayaAnak += biaya;
        } else if ("dewasa".equalsIgnoreCase(kategori)) {
            totalBiayaDewasa += biaya;
        }
    }

    public String getNama() {
        return nama;
    }

    public int hitungBiaya() {
        if ("anak".equalsIgnoreCase(kategori)) {
            return durasi * 10000;
        } else if ("dewasa".equalsIgnoreCase(kategori)) {
            return durasi * 20000;
        } else {
            return 0;
        }
    }

    public void displayInfo() {
        System.out.println("Kategori : " + kategori);
        System.out.println("Nama : " + nama);
        System.out.println("Durasi : " + durasi);
        System.out.println("Biaya : " + biaya);
    }

    public static Wahana sequentialSearchByNama(String keyword) {
        for (int i = 0; i < index - 1; i++) {
            if (daftarWahana[i].getNama().toLowerCase().contains(keyword.toLowerCase())) {
                return daftarWahana[i];
            }
        }
        return null;
    }

    public static void sortingDataByBiaya() {
        for (int i = 0; i < index; i++) {
            for (int j = i + 1; j < index; j++) {
                if (daftarWahana[i].biaya < daftarWahana[j].biaya) {
                    Wahana temp = daftarWahana[i];
                    daftarWahana[i] = daftarWahana[j];
                    daftarWahana[j] = temp;
                }
            }
        }
    }

    public static int hitungPendapatanByKategori(String kategori) {
        if ("anak".equalsIgnoreCase(kategori)) {
            return totalBiayaAnak;
        } else if ("dewasa".equalsIgnoreCase(kategori)) {
            return totalBiayaDewasa;
        } else {
            return 0;
        }
    }
}
