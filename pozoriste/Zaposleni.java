package pozoriste;

public class Zaposleni {

	private String punoIme;
	private Pozoriste pozoriste;

	public Zaposleni(String punoIme, Pozoriste pozoriste) {
		super();
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
		return punoIme;
	}

}
