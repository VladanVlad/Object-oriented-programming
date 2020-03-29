package Zadatak_2_0313;

import java.util.ArrayList;

public class Predstava {

	private String nazivPredstave;
	private Pozoriste pozoriste;
	private ArrayList<Zaposleni> zaposleni;

	public Predstava(String nazivPredstave, Pozoriste pozoriste) {
		this.nazivPredstave = nazivPredstave;
		this.pozoriste = pozoriste;
		this.zaposleni = new ArrayList<Zaposleni>();
	}

	public void addZaposleni(Zaposleni neki) {
		zaposleni.add(neki);
	}

	public void removeZaposleni(Zaposleni neki) {
		zaposleni.remove(neki);
	}

	public int getBrojZaposlenih() {
		return zaposleni.size();
	}

	@Override
	public String toString() {
		String temp = this.nazivPredstave + ", " + this.pozoriste + ":";
		for (int i = 0; i < zaposleni.size(); i++) {
			temp += "\n" + zaposleni.get(i);
		}
		return temp;
	}

	/*
	 * Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv
	 * pozorista u kojem se predstava odrzava razdvojene zarezom, a potom zaposlene
	 * koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).
	 */

}
