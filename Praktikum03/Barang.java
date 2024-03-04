package Praktikum03;

public class Barang {
    public String nama;
    public double harga;
    public int stok;

    
    public Barang (String nama, double harga, int stok){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    public void tambahStokBarang (int jumlahTambahStok) {
        this.stok += jumlahTambahStok;
        System.out.println("Stok berhasil ditambahkan. ");
    }
    public void tampilkanInfoBarang() {
        System.out.println("Nama barang  : " + this.nama);
        System.out.println("Harga barang : " + this.harga);
        System.out.println("Stok barang  : " + this.stok);

    }
}
