package swiat;

public class Chaos {

    private final Swiat swiat = new Swiat();

    private void naPoczatkuBylo(Slowo slowo) {
        System.out.println("Na początku było " + slowo);

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
