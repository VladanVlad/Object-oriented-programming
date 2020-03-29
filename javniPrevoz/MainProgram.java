package javniPrevoz;

public class MainProgram {

	public static void main(String[] args) {
		Vozac marko = new Vozac("Marko Nikolic");
		Putnik br1 = new Putnik("Putnik", 550);
		Putnik br2 = new Putnik("Putnik dva", 1000);
		Putnik br3 = new Putnik("Putnica", 50);
		
		Autobus ikar = new Autobus("Ikarbus", 100);
		ikar.addPutnika(br1);
		ikar.addPutnika(br2);
		ikar.addPutnika(br3);
		ikar.setVozac(marko);
		System.out.println(ikar.getVozac());
		ikar.naplataKarte(br1);
		ikar.naplataKarte(br2);
		ikar.naplataKarte(br3);
		System.out.println(ikar.toString());
	}

}
