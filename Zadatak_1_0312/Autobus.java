package Zadatak_1_0312;

import java.util.ArrayList;

public class Autobus {
	private String naziv;
	private Vozac vozac;
	private double cenaKarte;
	private ArrayList<Putnik> putnici;

	public Autobus(String naziv, double cenaKarte) {
		super();
		this.vozac = null;
		this.naziv = naziv;
		this.cenaKarte = cenaKarte;
		this.putnici = new ArrayList<Putnik>();
	}

	public Vozac getVozac() {
		return vozac;
	}

	public void setVozac(Vozac vozac) {
		if (this.vozac == null)
			this.vozac = vozac;
	}

	public void removeVozac() {
		if (this.vozac != null)
			this.vozac = null;
	}

	public ArrayList<Putnik> getPutnici() {
		return putnici;
	}

	public void addPutnik(Putnik osoba) {
		putnici.add(osoba);
		if (vozac != null) {
			if (naplatiKartu(osoba))
				System.out.println("Karta uspesno naplacena");
			else
				System.out.println("Nema dovoljno sredstava");
		} else
			System.out.println("Vozac nije prisutan.");
	}

	public boolean removePutnik(Putnik osoba) {
		for (int i = 0; i < putnici.size(); i++)
			if (osoba == putnici.get(i)) {
				putnici.remove(i);
				return true;
			}
		return false;
	}

	private boolean naplatiKartu(Putnik osoba) {
		return osoba.oduzmiNovac(cenaKarte);
	}

	@Override
	public String toString() {
		String temp = this.naziv + " ( " + this.vozac + " - ";
		if (putnici.size()>0)
			temp = temp + putnici.get(0) + " [" + putnici.get(0).getNovac() + "]";
		for (int i = 1; i < putnici.size(); i++) {
			temp = temp + ", " + putnici.get(i) + " [" + putnici.get(i).getNovac() + "]";
		}
		return temp + ")";

		// Naziv ( vozac - Putnik1[novac], Putnik2 [novac],... )
	}
}
