package Zadatak_1_0309;

import java.util.Arrays;

public class Klub {
	private String klub;
	private String sediste;
	private int osnovan;
	private Sportista[] sportisti;

	public Klub(String klub, String sediste, int osnovan, Sportista[] clanovi) {
		super();
		this.klub = klub;
		this.sediste = sediste;
		this.osnovan = osnovan;
		this.sportisti = clanovi;
	}

	public String getKlub() {
		return klub;
	}

	public void setKlub(String klub) {
		this.klub = klub;
	}

	public String getSediste() {
		return sediste;
	}

	public int getOsnovan() {
		return osnovan;
	}

	public Sportista[] getSportista() {
		return sportisti;
	}

	@Override
	public String toString() {
		String temp = klub + ", sa sedistem u gradu " + sediste + ", osnovan " + osnovan
				+ ". Igraci u klubu su:\n";
		temp = temp + sportisti[0].toString();
		for (int i = 1; i < sportisti.length; i++) {
			temp = temp + ",\n" + sportisti[i].toString();
		}
		return temp;
	}

}
