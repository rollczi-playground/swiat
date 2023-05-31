package swiat;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Chaos {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
    private final Swiat swiat = new Swiat();

    private void naPoczatkuBylo(Slowo slowo) {
        LocalTime time = LocalTime.now();
        System.out.println("Na początku było " + slowo + " o godzinie " + time.format(formatter));

        this.swiat.wlacz();
    }

    private void naKoncuBylo(Slowo slowo) {
        System.out.println("Na końcu było " + slowo);

        this.swiat.wylacz();
    }

    public static void main(String[] args) {
        Chaos chaos = new Chaos();

        chaos.naPoczatkuBylo(new Slowo("Nic"));
        chaos.naKoncuBylo(new Slowo("Chaos"));
    }

}
