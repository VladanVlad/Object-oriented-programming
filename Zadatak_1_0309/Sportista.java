package Zadatak_1_0309;

public class Sportista {
	private String ime, prezime;
	private int godinaRodjenja;

	public Sportista(String ime, String prezime, int godinaRodjenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.godinaRodjenja = godinaRodjenja;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}

	public String toString() {
		return ime + "_" + prezime + ": " + godinaRodjenja;
	}
}
