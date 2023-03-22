package swiat.beton;

public class KomputerMatisa implements Betonable {

    @Override
    public void betonuj(Beton beton) {
        System.out.println("Do komputera Matisa wlewa się " + beton.getIloscBetonu() + " litrów betonu");
    }

}
