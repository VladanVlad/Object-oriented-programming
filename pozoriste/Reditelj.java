package pozoriste;

public class Reditelj extends Zaposleni {

	private String nadimak;

	public Reditelj(String punoIme, Pozoriste pozoriste, String nadimak) {
		super(punoIme, pozoriste);
		this.nadimak = nadimak;
	}

	public String getNadimak() {
		return nadimak;
	}

	@Override
	public String toString() {
		return nadimak + "\t[" + getPozoriste() + "]";
	}
}
