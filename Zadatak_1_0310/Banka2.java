package Zadatak_1_0310;
import java.util.ArrayList;

/*
 * ArrayList.add();
 * ArrayList.get(index);
 * ArrayList.remove(index);
 */
public class Banka2 {
	private ArrayList<Racun> racuni;

	public Banka2() {
		racuni = new ArrayList<Racun>();
	}

	public void dodajRacun(Racun r) {
		racuni.add(r);
		racuni.size();
	}
	
	public Racun getRacun(String brRacuna) {
		Racun r = null;
		for (int i = 0; i<racuni.size(); i++) {
			String trazeniTR = racuni.get(i).getBrojRacuna();
			if (brRacuna.equals(trazeniTR)) {
				r = racuni.get(i);
				break;
			}
		}
		return r;
	}

}