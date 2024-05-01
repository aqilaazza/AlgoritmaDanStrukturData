package Klinik;
import java.util.Scanner;
public class KlinikDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int kapasitas = sc.nextInt();
        int menu;

        Queue myQueue = new Queue(kapasitas);

    do {

        System.out.println("\nMasukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueue ");
        System.out.println("2. Dequeue ");
        System.out.println("3. Print ");
        System.out.println("4. Peek ");
        System.out.println("5. Cek antrian paling belakang ");
        System.out.println("6. Tampilkan urutan data pasien (berdasarkan nama) ");
        System.out.println("7. Clear ");
        System.out.println("8. Exit ");
        System.out.println("-------------------------------------");

        menu = sc.nextInt();
        sc.nextLine();

        switch (menu) {
            case 1 : 
                System.out.print("Masukkan nama pasien : ");
                String nama = sc.nextLine();
                System.out.print("Masukkan no identitas : ");
                String nomorIdentitas = sc.nextLine();
                System.out.print("Masukkan jenis kelamin (L/P) : ");
                char jenisKelamin = sc.next().charAt(0);
    
                Pasien newPasien = new Pasien(nama, nomorIdentitas, jenisKelamin);
                myQueue.enqueue(newPasien);
                break;
            case 2 : 
                Pasien deletedData = myQueue.dequeue();
    
                if (deletedData != null) {
                    System.out.println("Data yang dikeluarkan : ");
                    System.out.println(deletedData);
                }
    
                break;
            case 3 :
                myQueue.print();
                break;
            case 4 : 
                myQueue.peek();
                break;
            case 5 :
                myQueue.peekRear();
                break;
            case 6 : 
            System.out.print("Masukkan nama pasien yang ingin ditemukan posisinya: ");
            String searchNama = sc.next();
            myQueue.peekPosition(searchNama);
            break;
            case 7 :
                myQueue.clear();
                break;
            }

    } while (menu >= 1 && menu <= 7);
}
}
