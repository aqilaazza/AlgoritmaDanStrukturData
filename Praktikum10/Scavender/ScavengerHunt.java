package Scavender;

import java.util.Scanner;

class ScavengerHunt {
    private Point startPoint;
    private Point currentPoint;
    private int wrongAnswerCount;
    private Scanner scanner;

    public ScavengerHunt() {
        scanner = new Scanner(System.in);
        wrongAnswerCount = 0;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
        this.currentPoint = startPoint;
    }

    public void moveToNextPoint(String playerAnswer) {
        if (currentPoint != null) {
            if (currentPoint.checkAnswer(playerAnswer)) {
                if (currentPoint.getNextPoint() == null) {
                    System.out.println("Permainan telah berakhir.");
                    return;
                }
                currentPoint = currentPoint.getNextPoint();
                wrongAnswerCount = 0;
            } else {
                System.out.println("Jawaban salah! Coba lagi.");
                wrongAnswerCount++;
                if (wrongAnswerCount == 2) {
                    System.out.println("Jawaban yang benar adalah: " + currentPoint.getJawab()); // Mengubah getAnswer menjadi getJawab
                    if (currentPoint.getNextPoint() == null) {
                        System.out.println("Permainan selesai. Sampai jumpa!");
                        currentPoint = null;
                        return;
                    } else {
                        currentPoint = currentPoint.getNextPoint();
                        wrongAnswerCount = 0;
                    }
                } else {
                    System.out.println("Ingin kembali ke pertanyaan sebelumnya? (ya/tidak)");
                    String choice = scanner.nextLine();
                    if (choice.equalsIgnoreCase("ya")) {
                    } else if (choice.equalsIgnoreCase("tidak")) {
                        System.out.println("Permainan selesai.");
                        currentPoint = null;
                        return;
                    }
                }
            }
        }
    }

    public void playGame() {
        System.out.println("Scavenger Hunt Game!");
        System.out.println("Mulai dari awal:");
        while (currentPoint != null) {
            System.out.println("Soal: " + currentPoint.getSoal()); // Mengubah getQuestion menjadi getSoal
            System.out.print("Jawaban: ");
            String playerAnswer = scanner.nextLine();
            moveToNextPoint(playerAnswer);
        }
    }
}