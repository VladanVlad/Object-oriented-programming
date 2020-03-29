package Zadatak_1_0312;

public class MainProgram {

	public static void main(String[] args) {
		Autobus ikar = new Autobus("Ikarbus", 95.5);
		Vozac niko = new Vozac("Nikola", "Nikolic");
		Putnik br1 = new Putnik("Mar", "Maric", 200);
		Putnik br2 = new Putnik("Dejan", "Antic", 100);
		Putnik br3 = new Putnik("Milan", "Zoric", 90);
		ikar.addPutnik(br1);
		ikar.setVozac(niko);
		ikar.addPutnik(br2);
		ikar.addPutnik(br3);
		System.out.println(ikar);
		ikar.removePutnik(br1);
		System.out.println(ikar);
		ikar.removeVozac();
		System.out.println(ikar);
	}

}
