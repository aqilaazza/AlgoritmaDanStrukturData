package Praktikum05;

public class Kelas {
    public Mahasiswa[] daftarMahasiswa;
    public int index;

    public Kelas(int kuota) {
        daftarMahasiswa = new Mahasiswa[kuota];
        index = 0;
    }

    public void add(Mahasiswa mahasiswa) {
        if(index < daftarMahasiswa.length) {
            daftarMahasiswa[index] = mahasiswa;
            index++;
        } else {
            System.out.println("Kelas sudah penuh");
        }
    }

    public void displayInfo() {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            mahasiswa.displayInfo();
        }

        System.out.println();
    }

    public void bubleSortByIPK() {
        int n = daftarMahasiswa.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (daftarMahasiswa[j].ipk > daftarMahasiswa[j+1].ipk) {
                    Mahasiswa temp = daftarMahasiswa[j];
                    daftarMahasiswa[j] = daftarMahasiswa[j + 1];
                    daftarMahasiswa[j + 1] = temp;
                }
            }
        }
        System.out.println("Urutan Ipk dari yang terkecil : ");
    }

    public void selectionSortByUmur() {
        int n = daftarMahasiswa.length;

        for(int i = 0; i < n - 1 ; i++) {
            int minIndex = i;

            for(int j = i + 1; j < n; j++) {
                if(daftarMahasiswa[j].umur > daftarMahasiswa[minIndex].umur) {
                    minIndex  = j;
                }
            }

            Mahasiswa temp = daftarMahasiswa[minIndex];
            daftarMahasiswa[minIndex] = daftarMahasiswa[i];
            daftarMahasiswa[i] = temp;
        }
        System.out.println("Urutan umur dari yang terbesar : ");
    }

    public void insertionSortByIPKDesc() {
        int n = daftarMahasiswa.length;

        for(int i = 1; i < n ; i++) {
            Mahasiswa key = daftarMahasiswa[i];
            int j = i - 1;

            while(j >= 0 && daftarMahasiswa[j].ipk < key.ipk) {
                daftarMahasiswa[j + 1] = daftarMahasiswa[j];
                j = j - 1;
            }
            daftarMahasiswa[j + 1] = key;
        }
        System.out.println("urutan ipk dari yang terbesar : ");
    }
    

    public Mahasiswa sequentialSearchByNama(String keyword) {
        for (int i = 0; i < index; i++) {
            if (daftarMahasiswa[i].getNama().toLowerCase().contains(keyword.toLowerCase())) {
                return daftarMahasiswa[i];
            }
        }
        return null;
    }

    public Mahasiswa[] binarysearchByUmur(int umur) {
       int jumlah = 0;
       for(int i = 0; i < index; i++) {
        if(daftarMahasiswa[i].getUmur() == umur) {
            jumlah++;
        }
       }

       Mahasiswa[] result = new Mahasiswa[jumlah];
       int resultIndex = 0;

       for(int i = 0; i < index; i++) {
        if (daftarMahasiswa[i].getUmur() == umur) {
            result[resultIndex] = daftarMahasiswa[i];
            resultIndex++;
        }
       }

       if(resultIndex == 0) {
        System.out.println("Tidak ditemukan mahasiswa dengan umur " +umur);
       
    }
       return result;
    }   
}
