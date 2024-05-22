public class Point {
    String soal;
    String jawab;
    Point nextPoint;

    public Point(String soal, String jawab) {
        this.soal = soal;
        this.jawab = jawab;
        this.nextPoint = null;
    }
} 