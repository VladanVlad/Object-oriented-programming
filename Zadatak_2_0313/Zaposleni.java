package Zadatak_2_0313;

public class Zaposleni {

	/*
	 * Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i
	 * pozoristem u kojem je zaposlen. Svi podaci mogu da se dohvate. Moze da se
	 * sastavi tekstualni opis u obliku ime[naziv_pozorista].
	 */

	private String punoIme;
	private Pozoriste pozoriste;
	
	public Zaposleni(String punoIme, Pozoriste pozoriste) {
		this.punoIme = punoIme;
		this.pozoriste = pozoriste;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	@Override
	public String toString() {
		return punoIme + "[" + pozoriste + "] ";
	}
	
	
}
