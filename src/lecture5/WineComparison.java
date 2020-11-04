package lecture5;

public class WineComparison {

    public static void main(String[] args) {
        Wine undefinedGlass = new Wine("", "", 10);
        Wine glassForIvan = new Wine("red", "Argentina", 14.2);
        Wine glassForAnna = new Wine("white", "France", 12.1);
        Wine glassForVasya = new Wine("red", "France", 12);
        Wine glassForVesta = new Wine("white", "Germany", 12);

        Wine[] glassesOfWine = new Wine[] { glassForIvan, glassForAnna, glassForVasya, glassForVesta };

        undefinedGlass.findTheGlassOfWine(glassesOfWine, glassForAnna);
    }
}
