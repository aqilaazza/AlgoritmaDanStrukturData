import java.util.Scanner;

public class WahanaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int menuPilihan = 0;
        int totalBiaya = 0;
        
        while (menuPilihan != 5) {
            System.out.println("===============================");
            System.out.println("||          Menu:            ||");
            System.out.println("===============================");
            System.out.println("||     1. Input Data         ||");
            System.out.println("||     2. Cari Data          ||");
            System.out.println("||     3. Lihat Data         ||");
            System.out.println("||     4. Laporan Pendapatan ||");
            System.out.println("||     5. Keluar             ||");
            System.out.println("===============================");
            System.out.print("Pilih menu: ");
            menuPilihan = sc.nextInt();
            sc.nextLine();

            switch (menuPilihan) {
                case 1:
                    System.out.print("Masukkan jumlah kuota pengunjung: ");
                    int kuota = sc.nextInt();
                    sc.nextLine();

                    Wahana.daftarWahana = new Wahana[kuota];
                    Wahana.index = 0;

                    for (int i = 0; i < kuota; i++) {
                        System.out.println("Pengunjung ke - " + (i + 1));
                        System.out.print("Masukkan kategori pengunjung (anak/dewasa): ");
                        String kategori = sc.nextLine();
                        System.out.print("Masukkan nama pengunjung: ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan durasi bermain (jam): ");
                        int durasi = sc.nextInt();
                        sc.nextLine();

                        Wahana pengunjung = new Wahana(kategori, nama, durasi);
                        Wahana.daftarWahana[Wahana.index++] = pengunjung;
                    }
                    System.out.println("=====================================");
                    System.out.println("        Data Pengunjung            ");
                    System.out.println("=====================================");
                    for (int i = 0; i < Wahana.index; i++) {
                        System.out.println("> Pengunjung Ke- " + (i + 1));
                        Wahana.daftarWahana[i].displayInfo();
                        totalBiaya += Wahana.daftarWahana[i].biaya;
                    }
                    System.out.println("======================================");
                    System.out.println("Total Biaya : " + totalBiaya);
                    System.out.println("======================================");
                    System.out.println();
                    break;
                
                case 2:
                    System.out.print("Masukkan nama pengunjung: ");
                    String inputNama = sc.nextLine();

                    Wahana pengunjungDitemukan = Wahana.sequentialSearchByNama(inputNama);
                    if (pengunjungDitemukan != null) {
                        System.out.println("===========================================");
                        System.out.println("Data pengunjung ditemukan:");
                        System.out.println("===========================================");
                        pengunjungDitemukan.displayInfo();
                        System.out.println("===========================================");
                    } else {
                        System.out.println("===========================================");
                        System.out.println("Nama pengunjung " + inputNama + " tidak ditemukan. ");
                        System.out.println("===========================================");
                    }
                    System.out.println();
                    break;
                
                case 3:
                    Wahana.sortingDataByBiaya();
                    System.out.println("===========================================");
                    System.out.println ("  Data Pengunjung Berdasarkan Biaya:");
                    System.out.println("===========================================");
                    for (int i = 0; i < Wahana.index; i++) {
                        Wahana.daftarWahana[i].displayInfo();
                    System.out.println("===========================================");
                    }
                    System.out.println();
                    break;
                
                case 4:
                    System.out.print("=====================================================");
                    System.out.println("\nLaporan Pendapatan Berdasarkan Kategori Pengunjung:");
                    System.out.println("=====================================================");
                    System.out.println("Total Pendapatan Anak: " + Wahana.hitungPendapatanByKategori("anak"));
                    System.out.println("=====================================================");
                    System.out.println("Total Pendapatan Dewasa: " + Wahana.hitungPendapatanByKategori("dewasa"));
                    System.out.println("=====================================================");
                    System.out.println("Total Pendapatan : " + totalBiaya);
                    System.out.println("=====================================================");
                    System.out.println();
                    break;
                
                case 5:
                    System.out.println("Berhasil keluar.");
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang ada (1/2/3/4/5).");
            }
        }
        sc.close();
    }
}
