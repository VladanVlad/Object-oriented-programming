package javniPrevoz;

public class Putnik extends Covek {

	private double novac;

	public Putnik(String imePrezime, double novac) {
		super(imePrezime);
		this.novac = novac;
	}
	
	public double getNovac() {
		return novac;
	}

	public boolean addNovac(double suma) {
		if (suma>0) {
			this.novac += suma;
		return true;
		}
		return false;
	}
	public boolean removeNovac(double suma) {
		if(suma>0 && suma<=novac) {
			novac-=suma; 
			return true;
		}
		return false;
	}

}
