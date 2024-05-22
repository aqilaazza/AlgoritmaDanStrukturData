package Scavender;
import java.util.Scanner;

class Point {
    private String soal; 
    private String jawab; 
    private Point nextPoint;
    private Point prevPoint;

    public Point(String soal, String jawab) {
        this.soal = soal;
        this.jawab = jawab;
        this.nextPoint = null;
        this.prevPoint = null;
    }

    public String getSoal() { 
        return soal;
    }

    public String getJawab() { 
        return jawab;
    }

    public void setNextPoint(Point nextPoint) {
        this.nextPoint = nextPoint;
    }

    public Point getNextPoint() {
        return nextPoint;
    }

    public void setPrevPoint(Point prevPoint) {
        this.prevPoint = prevPoint;
    }

    public Point getPrevPoint() {
        return prevPoint;
    }

    public boolean checkAnswer(String playerAnswer) {
        return jawab.equalsIgnoreCase(playerAnswer);
    }
}