package pozoriste;

import java.util.ArrayList;

public class Predstava {

	private String predstava;
	private Pozoriste pozoriste;
	private ArrayList<Zaposleni> zaposleni;

	public Predstava(String predstava, Pozoriste pozoriste) {
		this.predstava = predstava;
		this.pozoriste = pozoriste;
		this.zaposleni = zaposleni;
		this.zaposleni = new ArrayList<Zaposleni>();
	}

	public boolean removeZaposleni(Zaposleni covek) {
		for (int i = 0; i < zaposleni.size(); i++) {
			if (zaposleni.get(i) == covek) {
				covek = null;
				return true;
			}
		}
		return false;
	}

	public void addZaposleni(Zaposleni covek) {
		zaposleni.add(covek);
	}

	public int brojZaposlenih() {
		return zaposleni.size();
	}

	@Override
	public String toString() {
		String temp = this.predstava + ", " + this.pozoriste + ":";
		for (int i = 0; i<zaposleni.size(); i++) {
			temp+= "\n" + zaposleni.get(i);
		}
		return temp;
	}
}
