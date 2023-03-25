package swiat.bulka;

public class Bulka implements Bulkable {

	private boolean spalona;
	private boolean surowa;

	public Bulka() {
		this.spalona = false;
		this.surowa = true;
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
			this.spalona = true;
			this.surowa = false;
			return this;
		} else if (moc <= 32400 && moc > 12000) {
			System.out.println("Bułka idealna");
			this.surowa = false;
			this.spalona = false;
			return this;
		} else {
			System.out.println("Surowa bułka");
			this.surowa = true;
			this.spalona = false;
			return this;
		}
	}
}
