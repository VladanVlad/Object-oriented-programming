package Zadatak_1_0306;

public class Sportista {
	private String ime, prezime;
	private String sport;
	private String klub;
	private int broj_dresa;

	public Sportista (String ime, String prezime, String sport) {
		this.ime = ime;
		this.prezime = prezime;
		this.sport = sport;
	}
	public Sportista(String ime, String prezime, String sport, String klub, int broj_dresa) {
		this.ime = ime;
		this.prezime = prezime;
		this.sport = sport;
		this.klub = klub;
		this.broj_dresa = broj_dresa;
	}

	public String getKlub() {
		return klub;
	}

	public void setKlub(String klub) {
		this.klub = klub;
	}

	public int getBroj_dresa() {
		return broj_dresa;
	}

	public void setBroj_dresa(int broj_dresa) {
		this.broj_dresa = broj_dresa;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public String getSport() {
		return sport;
	}

	@Override
	public String toString() {
		return "Sportista " + ime + " " + prezime + ", bavi se " + sport + ", u klubu " + klub + ", sa brojem dresa "
				+ broj_dresa;
	}

}
