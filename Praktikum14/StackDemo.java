import java.util.Stack;
import java.util.Objects;

public class StackDemo {
    public static void main(String[] args) {
        Book book1 = new Book("1234", "Dasar Pemrograman");
        Book book2 = new Book("7145", "Hafalan Shalat Delisa");
        Book book3 = new Book("3562", "Muhammad Al-Fatih");

        Stack<Book> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        System.out.println("Peek : ");
        Book temp = books.peek();
        if(temp != null) {
            System.out.println(temp.toString());
        }

        System.out.println("Pop : ");
        Book temp2 = books.pop();
        if(temp2 != null) {
            System.out.println(temp2.toString());
        }

        System.out.println("Cetak buku tersisa : ");
        for (Book book : books) {
            System.out.println(book.toString());
        } 

        System.out.println("Menampilkan seluruh elemen : ");
        System.out.println(books);

        System.out.println("Finding book : ");
        int posisi = books.search(new Book("7145", "Hafalan Shalat Delisa"));
        if (posisi != -1) {
            System.out.println("Buku ditemuakan pada posisi: " + posisi);
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }
}
