package Praktikum06;

public class Sorting {
    
    public static int sequentialSearch(int [] arr, int key){
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearchAsc(int[] arr, int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid =start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            }

            if(arr[mid] < key) {
                start = mid + 1; //perbedaan ascending
            } else {
                end = mid - 1; //perbedaan ascending
            }
        }
        return -1;
    }

    public static int binarySearchDsc(int[] arr, int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            }

            if(arr[mid] < key) {
                end = mid - 1; //perbedaan descending
            } else {
                start = mid + 1; //perbedaan descending
            }
        }
        return -1;
    }

    public static int binarySearch(int [] arr, int key) { 
        if(arr.length == 0) {
        }
        if (arr[0] < arr[arr.length - 1]) {
            return binarySearchAsc(arr, key);
        } else if (arr[0] > arr[arr.length - 1]) {
            return binarySearchDsc(arr, key);
        } else {
            return -1;
        }
    }


    public static void main(String[] args) {
        System.out.println("Sequential Search : ");
        int [] daftarNilai = {10, 5, 20, 15, 5, 45};
        int idx = sequentialSearch(daftarNilai, 5);

        if(idx != -1) {
            System.out.println("Data ditemukan pada indeks ke -" + idx);
        } else {
            System.out.println("Data tidak ditemukan");
        }

        System.out.println("\nBinary Search Ascending : ");
        int[] BinaryAscending = { 5, 5, 10, 20, 30, 40, 50};
        int index = binarySearchAsc(BinaryAscending, 5);

        if (index != -1) {
            System.out.println("Data ditemukan pada indeks ke- " + index);
        }
        else {
            System.out.println("Data tidak ditemukan");
        }

        System.out.println("\nBinary Search Descending : ");
        int[] BinaryDescending = {50, 40, 30, 20, 10, 5, 5};
        int i = binarySearchDsc(BinaryDescending, 5);

        if (i != -1) {
            System.out.println("Data ditemukan pada indeks ke- " + i);
        }
        else {
            System.out.println("Data tidak ditemukan");
        }

        System.out.println("\nBinary Search : ");
        int[] binarySearch = { 5, 5, 10, 20, 30, 40, 50};
        int indeks = binarySearch(binarySearch, 5);

        if (indeks != -1) {
            System.out.println("Data ditemukan pada indeks ke- " + indeks);
        }
        else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
