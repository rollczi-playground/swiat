package swiat.kebab;

import swiat.bulka.Bulka;

import java.util.Random;

public class Kebab extends Bulka implements Turkable, Kebabable {

    private final Random random = new Random();

    @Override
    public void jedzKebab() {
        boolean czyOstry = random.nextBoolean();

        if (czyOstry) {
            System.out.println("kebabowa moc pali dupe");
        } else {
            System.out.println("Moc energia kebaba z baranina!");
        }
    }

    @Override
    public void rubKebab() {
        String[] mienso = {"baranina", "kurczak", "wołowina"};
        int randomIndex = random.nextInt(mienso.length);
        String meat = mienso[randomIndex];

        System.out.println("alibaba kreci kebab z " + meat + "!");
    }
    

}
