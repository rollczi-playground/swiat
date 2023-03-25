package swiat.bulka;

public class Bulka implements Bulkable {

	private final boolean spalona;
	private final boolean surowa;

	public Bulka(boolean czySpalona, boolean czySurowa) {
		this.spalona = czySpalona;
		this.surowa = czySurowa;
		if (czySpalona && czySurowa) {
			throw new IllegalStateException("Bułka nie może być jednocześnie spalona i surowa");
		}
	}

	@Override
	public void jedz(Bulka bulka) {
		if (bulka.spalona) {
			System.out.println("bułka spalona, niedobra");
		} else if (bulka.surowa) {
			System.out.println("bułka surowa, niedobra");
		} else {
			System.out.println("bułka idealna, dobra");
		}
	}

	@Override
	public Bulka piecz(int stopnie, int czasWMinutach) {
		System.out.println("Bulka piecze sie na " + stopnie + " stopni przez " + czasWMinutach + " minut");
		if (czasWMinutach > 120) {
			System.out.println("Bułka spalona");
			return new Bulka(true, false);
		} else if (czasWMinutach <= 120 && czasWMinutach > 60) {
			System.out.println("Bułka idealna");
			return new Bulka(false, false);
		} else {
			System.out.println("Surowa bułka");
			return new Bulka(false, true);
		}
	}
}
