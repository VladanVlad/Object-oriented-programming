package Zadatak_1_0312;

public class Covek {

	private String ime, prezime;

	public Covek(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	@Override
	public String toString() {
		return ime + " " + prezime;
	}
	
}
