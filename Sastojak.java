package zadatak_2;

public class Sastojak {
	private String naziv;
	private double cena;

	public Sastojak(String naziv, double cena) {
		this.naziv = naziv;
		if (cena>0) {
		this.cena = cena;
		}
		else {
			this.cena = 0;
		}
	}

	public String getNaziv() {
		return naziv;
	}

	public double getCena() {
		return cena;
	}
	
	public boolean promeniCenu(double iznos) {
		if (iznos>0) {
			this.cena = iznos;
		return true;
		}
	return false;
	}

	@Override
	public String toString() {
		return naziv;
	}
}
