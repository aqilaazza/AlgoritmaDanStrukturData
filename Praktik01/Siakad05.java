import java.util.Scanner;
public class Siakad05 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 

        String mk[]  = {"PAMB      ", "KTI       ", "CTPS      ", "MATDAS    ", 
                        "BING      ", "DASPRO    ", "PRAKDASPRO", "BIND      ", "AGAMA     "};
        String huruf[] = {"A", "B+", "B","C+","C","D","E"};
        String nilaiHuruf = "";
        double setara[] = {4.0, 3.5, 3.0, 2.5, 2.0, 1.0, 0.0};
        double nilaiSetara = 0.0;
        double nilai = 0.0;
        double ip = 0.0, ipk = 0.0;
        int totalSks = 20; 
        int n [] = new int [9];

        System.out.println("================================");
        System.out.println(" Program Menghitung IP Semester ");
        System.out.println("================================");
        for ( int i =0; i < mk.length;i++) {
            System.out.print("Masukkan nilai angka MK " +mk[i] + ": ");
            n[i] = sc.nextInt();
        }

        
        System.out.println("====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================");
        System.out.println("MK\t\t\t\tNilai Angka\t\tNilai Huruf \t\t\t Bobot Nilai");
        for (int i =0; i < mk.length; i++) {
            if (80 <= n[i] && n[i] <= 100) {
                nilai = (double) n[i];
                nilaiHuruf = huruf [0];
                nilaiSetara = setara [0];
                ip += setara [0];
            } else if (73 <= n[i] && n[i] <= 80) {
                nilai = (double) n[i];
                nilaiHuruf = huruf [1];
                nilaiSetara = setara [1];
                ip += setara [1];
            } else if (65 <= n[i] && n[i] <= 73) {
                nilai = (double) n[i];
                nilaiHuruf = huruf [2];
                nilaiSetara = setara [2];
                ip += setara [2];
            } else if (60 <= n[i] && n[i] <= 65) {
                nilai = (double) n[i];
                nilaiHuruf = huruf [3];
                nilaiSetara = setara [3];
                ip += setara [3];
            } else if (50 <= n[i] && n[i] <= 60) {
                nilai = (double) n[i];
                nilaiHuruf = huruf [4];
                nilaiSetara = setara [4];
                ip += setara [4]; 
            } else if (39 <= n[i] && n[i] <= 50) {
                nilai = (double) n[i];
                nilaiHuruf = huruf [5];
                nilaiSetara = setara [5];
                ip += setara [5];
            } else {
                nilai = (double) n[i];
                nilaiHuruf = huruf [6];
                nilaiSetara = setara [6];
                ip += setara [6];
            }

            System.out.println( mk[i] + "\t\t\t" + nilai + "\t\t\t\t" + nilaiHuruf + "\t\t\t\t" +nilaiSetara);
    }
    ipk = ip/9;
    System.out.println("Nilai IPK : " + ipk);
}
}
