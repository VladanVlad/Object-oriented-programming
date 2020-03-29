package javniPrevoz;

import java.util.ArrayList;

public class Autobus {
	private String naziv;
	private Vozac vozac;
	private double cenaKarte;
	private ArrayList<Putnik> putnici;

	public Autobus(String naziv, double cenaKarte) {
		super();
		this.naziv = naziv;
		this.cenaKarte = cenaKarte;
		putnici = new ArrayList<Putnik>();
	}

	public Vozac getVozac() {
		return vozac;
	}

	public void setVozac(Vozac vozac) {
		if (this.vozac == null)
			this.vozac = vozac;
	}

	public void removeVozac(Vozac vozac) {
		if (vozac != null) {
			this.vozac = null;
		}
	}

	public void addPutnika(Putnik putnik) {
		putnici.add(putnik);
	}

	public boolean removePutnika(Putnik putnik) {
		for (int i = 0; i < putnici.size(); i++) {
			if (putnik == putnici.get(i)) {
				putnici.remove(i);
				return true;
			}
		}
		return false;
	}

	public ArrayList<Putnik> getPutnici() {
		return putnici;
	}

	public void naplataKarte(Putnik putnik) {
		if (vozac != null) {
			if (naplatiKartu(putnik)) {
				System.out.println("Karta je uspesno naplacena");
			} else
				System.out.println("Putnik nije imao dovoljno para");
		} else
			System.out.println("Vozac nije prisutan u autobusu");
	}

	private boolean naplatiKartu(Putnik putnik) {
		return putnik.removeNovac(cenaKarte);
	}

	@Override
	public String toString() {
		String temp = this.naziv + "(" + this.vozac + " - " + putnici.get(0);
		for (int i = 1; i < putnici.size(); i++) {
			temp += ", " + putnici.get(i) + "[" + putnici.get(i).getNovac() + "]";
		}
		return temp + ")";
	}

}
