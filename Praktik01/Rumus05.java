import java.util.Scanner;
public class Rumus05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu;
        double s,v,t;

        do {
            System.out.println("==========================================");
            System.out.println("            PILIH MENU DIBAWAH !           ");
            System.out.println("==========================================");
            System.out.println("1. Menghitung Hasil Perhitungan Kecepatan ");
            System.out.println("2. Menghitung hasil perhitungan jarak");
            System.out.println("3. Menghitung hasil perhitungan waktu");
            System.out.println("4. Exit");
            System.out.println("===========================================");
            System.out.print("Masukkan menu pilihan (1/2/3/4) : ");
            menu = sc.nextInt();
            switch (menu) {
                case 1 : //Menghitung Kecepatan
                    System.out.print("Masukkan jarak tempuh yang dilalui (m) : ");
                    s = sc.nextDouble();
                    System.out.print("Masukkan waktu yang dibutuhkan (s) : ");
                    t = sc.nextDouble();
                    v = s/t;
                    System.out.println("Kecepatan yang dibutukan adalah " +v+ " m/s"); 
                    break;
                case 2 : //Menghitung Jarak
                    System.out.print("Masukkan besar kecepatam (m/s) : ");
                    v = sc.nextDouble();
                    System.out.print("Masukkan waktu yang dibutuhkan (s) : ");
                    t = sc.nextDouble();
                    s = v*t;
                    System.out.println("Jarak yang harus ditempuh adalah " +s+ " m");
                    break;
                case 3 : //Menghitung Waktu
                    System.out.print("Masukkan besar kecepatam (m/s) : ");
                    v = sc.nextDouble();
                    System.out.print("Masukkan jarak yang ditempuh (m) : ");
                    s = sc.nextDouble();
                    t = s/v;
                    System.out.println("Waktu yang dibutuhkan adalah " +t+ " s" );
                    break;
                case 4 : //Exit
                    System.out.println("Terima Kasih");
                    break;
                default:
                System.out.println("Silahkan masukkan menu yang tersedia !");      
            }
        } while (menu !=4);

        sc.close();
    }
}
