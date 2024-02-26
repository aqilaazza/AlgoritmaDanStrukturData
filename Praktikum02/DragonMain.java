package Praktikum02;

public class DragonMain {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon(10, 10, 1);
        Dragon dragon2 = new Dragon(20, 20, 2);

        dragon1.move(5);
        dragon1.printStatus();

        dragon2.move(10);
        dragon2.printStatus();


    }
}
