package Scavender;
public class ScavengerHuntMain {
    public static void main(String[] args) {
        Point game1 = new Point("Apa nama ibukota Indonesia?", "jakarta");
        Point game2 = new Point("Jika x + 4 = 4, maka X adalah?", "0");
        Point game3 = new Point("Bulan apa hari pramuka diperingati?", "agustus");
        Point game4 = new Point("Sebutkan bilangan prima diantara 1 dan 5?", "3");
        Point game5 = new Point("Bilangan binary terdiri dari angka 0 dan?", "1");

        game1.setNextPoint(game2);
        game2.setNextPoint(game3);
        game2.setPrevPoint(game1);
        game3.setPrevPoint(game2);
        game3.setNextPoint(game4);
        game4.setPrevPoint(game3);
        game4.setNextPoint(game5);
        game5.setPrevPoint(game4);

        ScavengerHunt game = new ScavengerHunt();
        game.setStartPoint(game1);
        game.playGame();
    }
}