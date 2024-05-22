public class ScavengerHuntMain {
    public static void main(String[] args) {
        ScavengerHunt game = new ScavengerHunt();
        game.addPoint("Apa nama ibukota Indonesia ?", "jakarta");
        game.addPoint("Jika x + 4 = 4, maka X adalah ?", "0");
        game.addPoint("Bulan apa hari pramuka diperingati ?", "Agustus");
        game.addPoint("Sebutkan bilangan prima diantara 1 dan 5 ?", "3");
        game.addPoint("Bilangan binary terdiri dari angka 0 dan ?", "1");

        game.playGame();
    }
}