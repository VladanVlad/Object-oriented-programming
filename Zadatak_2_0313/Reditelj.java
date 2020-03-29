package Zadatak_2_0313;

public class Reditelj extends Zaposleni {

	/*
	 * Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. Tekstualni oblik je nadimak_ime[naziv_pozorista].
	 */
	private String nadimak;

	public Reditelj(String punoIme, Pozoriste pozoriste, String nadimak) {
		super(punoIme, pozoriste);
		this.nadimak = nadimak;
	}

	@Override
	public String toString() {
		return nadimak + "_" + getPunoIme() + "\t[" + getPozoriste() + "]";
	}
	
	
}
