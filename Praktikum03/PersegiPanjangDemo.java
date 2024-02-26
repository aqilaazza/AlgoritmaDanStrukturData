package Praktikum03;
import java.util.Scanner;

public class PersegiPanjangDemo {
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int jumlah, panjang, lebar;

    System.out.print("Masukkan jumlah persegi panjang : ");
    jumlah = sc.nextInt();

    PersegiPanjang[] arrayOfPersegiPanjang  = new PersegiPanjang[jumlah];

    for(int i = 0; i < jumlah; i++) {
        System.out.println("Persegi panjang ke-" + (i + 1));
        System.out.print("Masukkan panjang : ");
        panjang = sc.nextInt();
        System.out.print("Masukkan lebar : ");
        lebar = sc.nextInt();

        arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
        arrayOfPersegiPanjang[i].hitungLuas(panjang, lebar);
        arrayOfPersegiPanjang[i].hitungKeliling(panjang, lebar);
        }

    for (int j = 0; j < jumlah; j++) {
            System.out.println("Persegi Panjang ke-" + (j+1) + " : ");
            arrayOfPersegiPanjang[j].cetakInfo();
        }
   }
}
