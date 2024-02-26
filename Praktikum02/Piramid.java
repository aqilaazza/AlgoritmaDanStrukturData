package Praktikum02;

public class Piramid {
    
    int luasAlas;
    int tinggi;
    int luasSisiTegak;

public Piramid (int luasAlas, int tinggi, int luasSisiTegak) {
    this.luasAlas = luasAlas;
    this.tinggi = tinggi;
    this.luasSisiTegak = luasSisiTegak;

}

public void menghitungVolume() {
    double volume = (1.0/3.0) * luasAlas * tinggi; 
    System.out.println("Volume Piramida adalah " + volume);

}

public void menghitungLuasPermukaan(){
    double luasPermukaan = luasAlas + (luasSisiTegak * 4.0);
    System.out.println("Luas Permukaan Piramida adalah " + luasPermukaan);

}
}
