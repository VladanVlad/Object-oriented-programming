package javniPrevoz;

public class Vozac extends Covek{
	private String zanimanje;

	public Vozac(String imePrezime) {
		super(imePrezime);
		this.zanimanje = "sofer";
	}

	public String getZanimanje() {
		return zanimanje;
	}

	public void setZanimanje(String zanimanje) {
		this.zanimanje = zanimanje;
	}
	
	
	
	
}
