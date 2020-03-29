package Zadatak_2_0313;

public class Glumac extends Zaposleni {

	/*
	 * Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je uloga_ime[naziv_pozorista]
	 */
	private String uloga;

	public Glumac(String punoIme, Pozoriste pozoriste, String uloga) {
		super(punoIme, pozoriste);
		this.uloga = uloga;
	}

	@Override
	public String toString() {
		return uloga + "_" + getPunoIme() + "\t[" + getPozoriste() + "]";
	}
	
	
}
