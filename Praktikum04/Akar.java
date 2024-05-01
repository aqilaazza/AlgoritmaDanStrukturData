import java.util.Scanner;

public class Akar {
    public static int BruteForce(int n) {
        int akar = 0;
        while (akar * akar <= n) {
            akar++;
        }
        return akar - 1;
    }

    public static int DivideConquer(int n) {
        return menghitungKuadrat(n, 0, n);
    }

    private static int menghitungKuadrat(int n, int left, int right) {
        if (left > right) {
            return right; 
        }
        int mid = left + (right - left) / 2;
        if (mid * mid == n) {
            return mid;
        } else if (mid * mid < n) {
            return menghitungKuadrat(n, mid + 1, right);
        } else {
            return menghitungKuadrat(n, left, mid - 1);
        }
    }
}

class AkarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Masukkan nilai n : ");
        n = sc.nextInt();

        System.out.println("Hasil Brute Force");
        int hasil = Akar.BruteForce(n);
        System.out.println("Akar dari " + n + " adalah: " + hasil);

        System.out.println("Hasil Divide Conquer");
        int result = Akar.DivideConquer(n);
        System.out.println("Akar dari " + n + " adalah: " + result);

    }
}
