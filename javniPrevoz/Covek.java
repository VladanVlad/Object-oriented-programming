package javniPrevoz;

public class Covek {
	private String imePrezime;

	public Covek(String imePrezime) {
		super();
		this.imePrezime = imePrezime;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	@Override
	public String toString() {
		return imePrezime;
	}
}
