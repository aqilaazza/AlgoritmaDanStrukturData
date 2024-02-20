package Praktikum02;

public class SnakeMain {
    
    public static void main(String [] args) {
        Snake snake1 = new Snake (2,3);
        Snake snake2 = new Snake (4,1);

        //Posisi Awal 
        System.out.println("First Position");
        snake1.printPosition();
        snake2.printPosition();

        snake1.moveRight();
        snake1.moveDown();

        snake2.moveLeft();
        snake2.moveUp();

        //Posisi Perubahan
        System.out.println("=======================");
        System.out.println("Position After Changing");
        snake1.printPosition();
        snake2.printPosition();



    }
}
