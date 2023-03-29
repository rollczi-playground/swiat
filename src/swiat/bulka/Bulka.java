package swiat.bulka;

import swiat.beton.Beton;
import swiat.beton.Betonable;

public class Bulka implements Betonable {

    private boolean spalona;
    private boolean surowa;

    public Bulka() {
        this.spalona = false;
        this.surowa = true;
    }

    public void jedzBulke() {
        if (this.spalona) {
            System.out.println("bułka spalona, niedobra");
        } else if (this.surowa) {
            System.out.println("bułka surowa, niedobra");
        } else {
            System.out.println("bułka idealna, dobra");
        }
    }

    public void pieczBulke(int stopnie, int czasWMinutach) {
        int moc = stopnie * czasWMinutach;
        System.out.println("Bulka piecze sie na " + stopnie + " stopni przez " + czasWMinutach + " minut");
        if (moc > 32400) {
            this.spalona = true;
            this.surowa = false;
        } else if (moc <= 32400 && moc > 12000) {
            this.surowa = false;
            this.spalona = false;
        } else {
            this.surowa = true;
            this.spalona = false;
        }
    }

    @Override
    public void betonuj(Beton beton) {
        System.out.println("Betonuję bułkę z " + beton.getIloscBetonu() + " litrów betonu");
    }
}
