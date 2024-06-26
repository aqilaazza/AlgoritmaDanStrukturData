package Tugas;
import java.util.Scanner;
public class CityMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input jumlah kota: ");
        int jumlahKota = sc.nextInt();
        sc.nextLine();

        City g = new City(jumlahKota);

        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Input nama kota " + (i+1) + " : ");
            String namaKota = sc.nextLine();
            g.addVertex(i, namaKota);
        }

        System.out.print("Input jumlah jalan: ");
        int jumlahJalan = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlahJalan; i++) {
            System.out.print("Kota 1: ");
            String kota1 = sc.nextLine();
            System.out.print("Kota 2: ");
            String kota2 = sc.nextLine();
            System.out.print("Jarak " + kota1 + " - " + kota2 + ": ");
            int jarak = sc.nextInt();
            sc.nextLine();

            int index1 = g.getVertexIndex(kota1);
            int index2 = g.getVertexIndex(kota2);

            if (index1 != -1 && index2 != -1) {
                g.addEdge(index1, index2, jarak);
            } else {
                System.out.println("Input Invalid");
                i--;
            }
        }
        g.print();
        sc.close();
    }
}
