package pozoriste;

public class Glumac extends Zaposleni {

	private String uloga;

	public Glumac(String punoIme, Pozoriste pozoriste, String uloga) {
		super(punoIme, pozoriste);
		this.uloga = uloga;
	}

	public String getUloga() {
		return uloga;
	}

	@Override
	public String toString() {
		return uloga + " \t[" + getPozoriste() + "]";
	}

}
