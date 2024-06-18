public class GaussSeidel2 {

    // Fungsi untuk menerapkan metode Gauss-Seidel
    public static void gaussSeidel(double[][] A, double[] b, double[] x, int maxIterations, double tolerance) {
        int n = b.length;
        double[] xOld = new double[n];
        
        for (int iteration = 1; iteration <= maxIterations; iteration++) {
            for (int i = 0; i < n; i++) {
                xOld[i] = x[i];
            }
            
            for (int i = 0; i < n; i++) {
                double sum = 0;
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        sum += A[i][j] * x[j];
                    }
                }
                x[i] = (b[i] - sum) / A[i][i];
            }
            
            // Checking for convergence
            double error = 0;
            for (int i = 0; i < n; i++) {
                error += Math.abs(x[i] - xOld[i]);
            }
            
            System.out.println("Iteration " + iteration + ": " + java.util.Arrays.toString(x));
            
            if (error < tolerance) {
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        // Matriks koefisien
        double[][] A = {
            {2, -1, 1},
            {1, 2, 1},
            {2, 1, -4}
        };
        
        // Vektor konstanta
        double[] b = {10, 20, 15};
        
        // Solusi awal (initial guess)
        double[] x = {2, 2, 1};
        
        // Maksimum iterasi
        int maxIterations = 25;
        
        // Toleransi error untuk konvergensi
        double tolerance = 0.01;
        
        gaussSeidel(A, b, x, maxIterations, tolerance);
        
        // Hasil akhir
        System.out.println("Final solution: " + java.util.Arrays.toString(x));
    }
}
