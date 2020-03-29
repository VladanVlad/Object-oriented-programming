package Zadatak_1_0306;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sportista[] tim = new Sportista[3];
		String temp_ime, temp_prezime, temp_sport, temp_klub;
		int temp_broj_dresa;
		for (int i = 0; i<3; i++) {
			temp_ime = sc.next();
			temp_prezime = sc.next();
			temp_sport = sc.next();
			temp_klub = sc.next();
			temp_broj_dresa = sc.nextInt();
			tim[i] = new Sportista(temp_ime, temp_prezime, temp_sport, temp_klub, temp_broj_dresa);
		}
		
		ispis(tim);
		tim[0].setBroj_dresa(sc.nextInt());
		System.out.println(tim[0].getBroj_dresa());
		
		tim[1].setKlub("Real Madrid");
		
		System.out.println("Sportista" + tim[1].getIme() + " " + tim[1].getPrezime() + " je presao u klub: " + tim[1].getKlub());
	}

	public static void ispis(Sportista[] tim_za_ispis) {
		for (int i = 0; i<3; i++) {
			System.out.println(tim_za_ispis[i]);
		}
	}
}
