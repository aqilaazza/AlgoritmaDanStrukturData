package Praktikum04;

public class Faktorial {
    public int nilai;

    public int faktorialBF(int n) {
        int fakto = 1;
        int iterasi = 0;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
            iterasi++;
        }
        System.out.println("Jumlah iterasi pada metode Brute Force adalah : " + iterasi);
        return fakto;
    }

    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            System.out.println("Jumlah iterasi untuk metode Divide and Conquer adalah : " +n);
            return fakto;
        }
    }
}
