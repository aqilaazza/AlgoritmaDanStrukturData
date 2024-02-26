package Praktikum02;

public class Dragon {
     int x; //datar
     int y; //vertikal
     int direction;

    public Dragon (int x, int y, int direction) {
       this.x = x;
       this.y = y;
       this.direction = direction;
    }
     public void changeDragon(int newDirection) {
        if (newDirection <= 1 && 4 >= newDirection ) {
            direction = newDirection;
        } else {
            System.out.println("Nomer tidak valid");
        }
     }
     public void move(int steps) {
        switch (direction) {
            case 1 : //atas
                this.y += steps;
                break;
            case 2 : //kanan
                this.x += steps;
                break;
            case 3 : //bawah
                this.y -= steps;
                break;
            case 4 : // kiri
                this.x -= steps;
                break;
            default:
                System.out.println("Masukkan angka 1/2/3/4");
        }
     }
     public void printStatus() {
        System.out.println("Position : " +x+ " , " +y+ ", Direction : " +direction);
     }
}
