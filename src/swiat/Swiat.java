package swiat;

import swiat.beton.Beton;
import swiat.beton.Betoniarka;
import swiat.beton.KomputerMatisa;
import swiat.bulka.Bulka;
import swiat.kebab.Kebab;
import swiat.wlaczable.Wlaczable;

public class Swiat implements Wlaczable {


    @Override
    public void wlacz() {
        Betoniarka betoniarka = new Betoniarka(new Beton(100));
        betoniarka.betonuj(new KomputerMatisa());

        Kebab kebab = new Kebab();
        kebab.rubKebab();
        kebab.jedzKebab();

        Bulka bulka = new Bulka();
        bulka.pieczBulke(100, 100);
        bulka.jedzBulke();
    }

    @Override
    public void wylacz() {

    }

}
