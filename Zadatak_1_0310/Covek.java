package Zadatak_1_0310;

public class Covek {
	private String ime, prezime;
	private String jmbg;
	private String lk;

	public Covek(String ime, String prezime, String jmbg, String lk) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.lk = lk;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public String getLk() {
		return lk;
	}

	@Override
	public String toString() {
		return ime + " " + prezime;
	}

}
