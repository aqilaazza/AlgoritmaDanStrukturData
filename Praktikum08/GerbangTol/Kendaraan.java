public class Kendaraan {
    public String noPlat;
    public String noKartu;
    public double saldo;

    public Kendaraan (String noPlat, String noKartu, double saldo) {
        this.noPlat = noPlat;
        this.noKartu = noKartu;
        this.saldo =saldo;
    }
public String toString() {
    return "No plat : " + noPlat + ", No Kartu : " +noKartu+ ", Saldo : " +saldo;
}
}