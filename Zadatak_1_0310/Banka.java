package Zadatak_1_0310;

public class Banka {
	private Racun[] racuni;
	private int poz;

	public Banka() {
		racuni = new Racun[100];
	}

	public void dodajRacun(Racun r) {
		racuni[poz] = r;
		poz ++;
	}
	
	public Racun getRacun(String brRacuna) {
		Racun r = null;
		for (int i = 0; i<poz; i++) {
			String trazeniTR = racuni[i].getBrojRacuna();
			if (brRacuna.equals(trazeniTR)) {
				r = racuni[i];
				break;
			}
		}
		return r;
	}

}