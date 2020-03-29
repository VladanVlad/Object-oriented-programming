package Zadatak_Biblioteka;

public class Autor {
	
	private String ime;
	private String prezime;
	private int godiste;
	
	public Autor(String ime, String prezime, int godiste) {
		this.ime = ime;
		this.prezime = prezime;
		this.godiste = godiste;
	}
	
	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getGodiste() {
		return godiste;
	}
	
	public String ispis() {
		return ime + " " + prezime + " (" + godiste + ")";
	}
	
	@Override
	public String toString() {
		return ime + " " + prezime + " (" + godiste + ")";
	}
	
	
}
