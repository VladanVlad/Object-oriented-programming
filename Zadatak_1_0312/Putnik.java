package Zadatak_1_0312;

public class Putnik extends Covek {
	private double novac;

	public Putnik(String ime, String prezime, double novac) {
		super(ime, prezime);
		this.novac = novac;
	}

	public double getNovac() {
		return novac;
	}

	public boolean dodajNovac(double novac) {
		if (novac > 0) {
			this.novac += novac;
			return true;
		}
		return false;
	}
	
	public boolean oduzmiNovac(double iznos) {
		if (iznos>0 && iznos<=novac) {
			this.novac -= iznos;
			return true;
		}
		return false;
	}

}
