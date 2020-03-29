package Zadatak_fakultet;

public class Student extends osoba {

	private int brIndeksa, godina;

	public Student(String ime, String prezime, String adresa, String jmbg, String brLK, int brIndeksa, int godina) {
		super(ime, prezime, adresa, jmbg, brLK);
		this.godina = godina;
		this.brIndeksa = brIndeksa;
	}

	public int getBrIndeksa() {
		return brIndeksa;
	}

	public int getGodina() {
		return godina;
	}
}