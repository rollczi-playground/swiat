package swiat.bulka;

public class Bulka implements Bulkable {

	private boolean spalona;
	private boolean surowa;

	public Bulka() {
	}

	protected Bulka(boolean czySpalona, boolean czySurowa) {
		this.spalona = czySpalona;
		this.surowa = czySurowa;
		if (czySpalona && czySurowa) {
			throw new IllegalStateException("Bułka nie może być jednocześnie spalona i surowa");
		}
	}

	@Override
	public void jedz() {
		if (this.spalona) {
			System.out.println("bułka spalona, niedobra");
		} else if (this.surowa) {
			System.out.println("bułka surowa, niedobra");
		} else {
			System.out.println("bułka idealna, dobra");
		}
	}

	@Override
	public Bulka piecz(int stopnie, int czasWMinutach) {
		int moc = stopnie * czasWMinutach;
		System.out.println("Bulka piecze sie na " + stopnie + " stopni przez " + czasWMinutach + " minut");
		if (moc > 32400) {
			System.out.println("Bułka spalona");
			return new Bulka(true, false);
		} else if (moc <= 32400 && moc > 12000) {
			System.out.println("Bułka idealna");
			return new Bulka(false, false);
		} else {
			System.out.println("Surowa bułka");
			return new Bulka(false, true);
		}
	}
}
