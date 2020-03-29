package Zadatak_fakultet;

public class GlavniProgram {

	public static void main(String[] args) {
		Student pera = new Student("Marko", "Peric", "Zmajeva 3", "2112999452314", "008761264", 1652017, 3);
		Profesor zika = new Profesor("Nikola", "Zikic", "Maracanska 25", "1312968786346", "007643512",
				"Matematicka uloga nasledjivanja u novom Eclipse okruzenju");
		System.out.println(pera.getIme());
		System.out.println(zika.getTemaDr());
	}

}
