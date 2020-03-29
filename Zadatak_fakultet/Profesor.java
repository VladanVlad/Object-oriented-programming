package Zadatak_fakultet;

public class Profesor extends osoba {
	private String temaDr;

	public Profesor(String ime, String prezime, String adresa, String jmbg, String brLK, String temaDr) {
		super(ime, prezime, adresa, jmbg, brLK);
		this.temaDr = temaDr;
	}

	public String getTemaDr() {
		return temaDr;
	}

}
