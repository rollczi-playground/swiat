package swiat.beton;

public class Betoniarka {

    private final Beton beton;

    public Betoniarka(Beton beton) {
        this.beton = beton;
    }

    public void betonuj(Betonable betonable) {
        betonable.betonuj(this.beton);
    }

}
