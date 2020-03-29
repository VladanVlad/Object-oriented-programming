package Zadatak_2_0313;

public class Pozoriste {

	/*
	 * Pozoriste ima jednoznacan automatski generisan celobrojan identifikator i
	 * naziv koji mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku
	 * naziv[id].
	 */

	public static int idGenerator=0;
	private int pozoristeId;
	private String naziv;
	
	public Pozoriste(String naziv) {
		this.pozoristeId = idGenerator;
		idGenerator++;
		this.naziv = naziv;
	}

	public int getPozoristeId() {
		return pozoristeId;
	}

	public String getNaziv() {
		return naziv;
	}

	@Override
	public String toString() {
		return naziv +"[" + pozoristeId + "]";
	}
	
}
