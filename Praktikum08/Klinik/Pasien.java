package Klinik;

public class Pasien {
    public String nama;
    public String nomorIdentitas;
    public char jenisKelamin;

    public Pasien(String nama, String nomorIdentitas, char jenisKelamin ) {
        this.nama = nama;
        this.nomorIdentitas = nomorIdentitas;
        this.jenisKelamin = jenisKelamin;
    }

    public String toString() {
        return "Nama : " + nama + ", Nomor Identitas : " + nomorIdentitas + ", Jenis Kelamin :  " + jenisKelamin;
    }
}
