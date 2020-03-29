package zadatak_2;

import java.util.ArrayList;

public class Torta extends Jelo {

	private boolean imaMargarin;
	private double procenatSecera;

	public Torta(String naziv) {
		super(naziv);
		this.imaMargarin = false;
		this.procenatSecera = 0;

	}

	public void dodajSastojak(Sastojak ime, int kolicina) {
		super.dodajSastojak(ime, kolicina);
		if (ime.getNaziv().toLowerCase().equals("margarin")) {
			imaMargarin = true;
		}
		if (ime.getNaziv().toLowerCase().equals("secer")) {
			ArrayList<Sastojak> tempListaSastojaka = this.listaSastojaka();
			ArrayList<Integer> tempGramaza = this.getGramaza();
			procenatSecera = 0;
			double ukupnaGramaza = 0;
			for (int i = 0; i < tempListaSastojaka.size(); i++) {
				ukupnaGramaza += tempGramaza.get(i);
				if (tempListaSastojaka.get(i).getNaziv().toLowerCase().equals("secer")) {
					procenatSecera += tempGramaza.get(i);
				}
			}
			procenatSecera = procenatSecera / ukupnaGramaza;
		}
	}

	public boolean isImaMargarin() {
		return imaMargarin;
	}

	public double getProcenatSecera() {
		return procenatSecera;
	}

}
