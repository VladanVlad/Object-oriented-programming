package Zadatak_ucionica;

public class Polaznik {
	private String ime, prezime;

	public Polaznik(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return this.ime;
	}

	public String getPrezime() {
		return this.prezime;
	}

	@Override
	public String toString() {
		return " Polaznik " + ime + "_" + prezime;
	}

}
