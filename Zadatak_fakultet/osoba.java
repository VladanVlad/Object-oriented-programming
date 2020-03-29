package Zadatak_fakultet;

public class osoba {
	private String ime, prezime, adresa, jmbg, brLK;

	public osoba(String ime, String prezime, String adresa, String jmbg, String brLK) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		this.jmbg = jmbg;
		this.brLK = brLK;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public String getAdresa() {
		return adresa;
	}

	public String getJmbg() {
		return jmbg;
	}

	public String getBrLK() {
		return brLK;
	}
}
