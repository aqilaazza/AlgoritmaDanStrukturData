package Praktikum02;

public class Snake {
    int x;
    int y; 

    public Snake (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void moveLeft() {
        x--;
    }
    public void moveRight() {
        x++;
    }
    public void moveUp () {
        y++;
    }
    public void moveDown() {
        y--;
    }
    public void printPosition() {
        System.out.println(x+ " , " +y);
    }
}
