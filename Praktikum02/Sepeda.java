package Praktikum02;

public class Sepeda {
    float kecepatan;
    int gear;

    public void tambahKecepatan (float increment) {
       if (kecepatan + increment <= 20) {
            kecepatan += increment;
       } else {
        kecepatan = 20;
       } 
    }

    public void kurangiKecepatan (float decrement) {
    if (kecepatan - decrement >= 0) {
        kecepatan -= decrement;
     } else {
        kecepatan = 0;
       }
    }

    public void cetakInfo() {
        System.out.println("Kecepatan : " +kecepatan);
        System.out.println("Gear : " +gear);
        System.out.println("======================");
    }
 }