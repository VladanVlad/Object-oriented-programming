package zadatak_2;

import java.util.ArrayList;

public class Jelo {
	private String naziv;
	private ArrayList<Sastojak> sastojci;
	private ArrayList<Integer> gramaza;

	public Jelo(String naziv) {
		this.naziv = naziv;
		sastojci = new ArrayList<Sastojak>();
		gramaza = new ArrayList<Integer>();
	}

	public void dodajSastojak(Sastojak ime, int kolicina) {
		sastojci.add(ime);
		gramaza.add(kolicina);
	}
	
	public ArrayList<Sastojak> listaSastojaka() {
		return this.sastojci;
	}

	public ArrayList<Integer> getGramaza() {
		return gramaza;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public double cenaJela() {
		double tempSuma = 0; 
		for (int i = 0; i<sastojci.size(); i ++) {
			tempSuma +=sastojci.get(i).getCena()*gramaza.get(i)/1000;
		}
		return tempSuma;
	}

	@Override
	public String toString() {
		String temp = naziv + ": " + sastojci.get(0); 
		for (int i = 1; i<sastojci.size(); i++) {
			temp += ", " + sastojci.get(i);
		}
	return temp;
	}
	
}
