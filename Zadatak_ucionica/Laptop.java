package Zadatak_ucionica;

import java.util.ArrayList;

import Zadatak_1_0310.Racun;

public class Laptop {
	private ArrayList<Polaznik> vlasnik;
	private String marka;

	public Laptop(String marka) {
		this.vlasnik = new ArrayList<Polaznik>();
		this.marka = marka;
	}

	public void dodajVlasnika(Polaznik p) {
		vlasnik.add(p);
	}

	public void obrisiVlasnika(Polaznik p) {
		vlasnik.remove(p);
	}

	@Override
	public String toString() {
		return marka + " " + vlasnik + ", ";
	}

}
