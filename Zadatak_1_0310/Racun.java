package Zadatak_1_0310;

public class Racun {
	private String brojRacuna;
	private double stanje;
	private Covek klijent;

	public Racun(String brojRacuna, Covek klijent) {
		super();
		this.brojRacuna = brojRacuna;
		this.klijent = klijent;
		stanje = 0;
	}

	public double dodajNovac(double suma) {
		if (suma > 0) {
			stanje += suma;
			return stanje;
		} else {
			System.out.println("Pogresan unos");
			return stanje;
		}
	}

	public double oduzmiNovac(double suma) {
		if (suma > 0 && stanje >= suma) {
			stanje = stanje - suma;
			return stanje;
		} else
			System.out.println("Nemate dovoljno novca na racunu");
		return stanje;
	}

	public String getBrojRacuna() {
		return brojRacuna;
	}

	public double getStanje() {
		return stanje;
	}

	public Covek getCovek() {
		return klijent;
	}

	@Override
	public String toString() {
		return "Racun " + brojRacuna + ", stanje " + stanje + "din, klijenta " + klijent;
	}

}
