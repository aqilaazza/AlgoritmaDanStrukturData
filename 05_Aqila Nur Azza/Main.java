import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama depan: ");
        String firstName = scanner.next(); // Menggunakan next() untuk membaca kata pertama.

        scanner.nextLine(); // Membaca karakter baris baru (newline) yang tersisa setelah next().

        System.out.print("Masukkan alamat: ");
        String address = scanner.nextLine(); // Menggunakan nextLine() untuk membaca seluruh baris.

        // Menampilkan hasil input.
        System.out.println("Nama depan: " + firstName);
        System.out.println("Alamat: " + address);
    }
}
