package Praktikum05;

public class Demo {
    public static void main(String[] args) {
        Kelas kelas1A = new Kelas (5) ;
        Mahasiswa mhs1 = new Mahasiswa("Ani", 18, 4.00);
        Mahasiswa mhs2 = new Mahasiswa("Budi", 19, 3.50);
        Mahasiswa mhs3 = new Mahasiswa("Cica", 17, 3.75);
        Mahasiswa mhs4 = new Mahasiswa("Deni", 20, 3.15);
        Mahasiswa mhs5 = new Mahasiswa("Eka", 18, 3.00);

        kelas1A.add(mhs1);
        kelas1A.add(mhs2);
        kelas1A.add(mhs3);
        kelas1A.add(mhs4);
        kelas1A.add(mhs5);

        kelas1A.bubleSortByIPK();
        kelas1A.displayInfo();
        kelas1A.selectionSortByUmur();
        kelas1A.displayInfo();
        kelas1A.insertionSortByIPKDesc();
        kelas1A.displayInfo();
        Mahasiswa mahasiswaDitemukan = kelas1A.sequentialSearchByNama("ud");
        if (mahasiswaDitemukan != null) {
            System.out.println("Data mahasiswa ditemukan dengan inisial nama (ud) adalah : ");
            mahasiswaDitemukan.displayInfo();
        } else {
            System.out.println("Mahasiswa dengan inisial nama (ca) tidak ditemukan.");
        }

        System.out.println();
        
        Mahasiswa[] umurDitemukan = kelas1A.binarysearchByUmur(18);
        if (umurDitemukan.length > 0) {
            System.out.println("Data mahasiswa ditemukan dengan umur (18) adalah : ");
            for (Mahasiswa mahasiswa : umurDitemukan) {
                mahasiswa.displayInfo();
            }
        } else {
            System.out.println("Data mahasiswa dengan umur (18) tidak ditemukan.");
        }
    }

}
