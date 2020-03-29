package Zadatak_ucionica;

public class GlavniProgram {

	public static void main(String[] args) {
		Polaznik marko = new Polaznik("Marko", "Markovic");
		Polaznik nikola = new Polaznik("Nikola", "Nikolic");
		Laptop enemy = new Laptop("Asus");
		enemy.dodajVlasnika(nikola);
		enemy.dodajVlasnika(marko);
		Laptop other = new Laptop("HP");
		other.dodajVlasnika(nikola);
		ispisi(enemy);
		ispisi(other);
		enemy.obrisiVlasnika(nikola);
		ispisi(enemy);
	}
public static void ispisi(Laptop enemy) {
	System.out.println(enemy);
}
}
