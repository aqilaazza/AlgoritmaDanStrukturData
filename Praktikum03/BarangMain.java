package Praktikum03;
import java.util.Scanner;

public class BarangMain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang : ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Barang [] dataBarang = new Barang[jumlah];

        for(int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data barang ke-" + (i+1));
            System.out.print("Masukkan nama barang : " );
            String nama = sc.nextLine();
            System.out.print("Masukkan harga barang : ");
            Double harga = Double.parseDouble(sc.nextLine());
            System.out.print("Masukkan stok barang : ");
            int stok = Integer.parseInt(sc.nextLine());

            dataBarang[i] = new Barang(nama, harga, stok);

        }

        int j = 0;
        for(Barang barang : dataBarang) {
            System.out.println("Data Barang ke- " +(j + 1));
            barang.tampilkanInfoBarang();
            j++;
        }

        System.out.println("Tambahkan stok barang : ");
        System.out.print("Masukkan indeks barang yang akan ditambah stoknya: ");
        int indeksTambahStok = sc.nextInt();
        System.out.print("Masukkan jumlah stok yang akan ditambahkan: ");
        int jumlahTambahStok = sc.nextInt();

        dataBarang[indeksTambahStok - 1].tambahStokBarang(jumlahTambahStok);

    }
}
