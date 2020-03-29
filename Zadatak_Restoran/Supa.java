package zadatak_2;

public class Supa extends Jelo {
	private double duzinaKuvanja;

	public Supa(String naziv, double duzinaKuvanja) {
		super(naziv);
		this.duzinaKuvanja = duzinaKuvanja;
	}

	public double getDuzinaKuvanja() {
		return duzinaKuvanja;
	}

}
