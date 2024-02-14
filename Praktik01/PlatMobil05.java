import java.util.Scanner;
public class PlatMobil05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char Kode[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char Kota[][] = {
                        {'B', 'A', 'N', 'T', 'E', 'N'},
                        {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
                        {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
                        {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
                        {'B', 'O', 'G','O','R'},
                        {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
                        {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
                        {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
                        {'M', 'A', 'L', 'A', 'N', 'G'},
                        {'T', 'E', 'G', 'A', 'L'}
                        };
        String InputKode;
        boolean ulang = false;

        do {
        System.out.print("Masukkan Kode Plat : ");
        InputKode = sc.nextLine();

        boolean tersedia = false;
        String kota = "";
        for(int i = 0; i < Kode.length;i++) {
            if(Kode[i] == InputKode.charAt(0)) {
                tersedia = true;
                kota = String.valueOf(Kota[i]);
                break;
            }
        }
       
        if (tersedia) {
            System.out.println("Kota " + kota);
        } else {
            System.out.println("Kota tidak ditemukan.");
        }
    }while (ulang = true);
    }
}