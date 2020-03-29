package Zadatak_1_0313;

public class Dete {

	private String ime;
	private int godine;
	private int brKlikera;
	public static int brDece = 0;
	public static int ukGodine = 0;
	
	public Dete(String ime, int godine, int brKlikera) {
		this.ime = ime;
		this.godine = godine;
		this.brKlikera = brKlikera;
		this.brDece++;
		this.ukGodine+=godine;
	}
	
	public void dodajKlikere(int kolicina) {
		if (kolicina>0)
		this.brKlikera += kolicina;
	}
	
	public void oduzmiKlikere(int kolicina) {
		if (kolicina>0 && kolicina<=brKlikera) 
			brKlikera-= kolicina;
	}
	
	public int getBrKlikera() {
		return this.brKlikera;
	}
	
	public double prosekGodina() {
		return ukGodine/brDece;
	}
	
	
}
