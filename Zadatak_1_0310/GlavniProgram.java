package Zadatak_1_0310;

import java.util.Scanner;

public class GlavniProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Banka Intesa = new Banka();
		System.out.println("Unesite nove klijente");
		System.out.println("Koliko klienata zelite da dodate: ");
		int broj = sc.nextInt();
		Covek[] klient = new Covek[broj];
		Racun[] ljudi = new Racun[broj];
		String temp_ime, temp_prezime, temp_jmbg, temp_lk;
		String temp_brojRacuna;
		for (int i = 0; i < klient.length; i++) {
			System.out.println("Ime i prezime klijenta");
			temp_ime = sc.next();
			temp_prezime = sc.next();
			System.out.println("JMBG");
			temp_jmbg = sc.next();
			System.out.println("Broj licne karte");
			temp_lk = sc.next();
			klient[i] = new Covek(temp_ime, temp_prezime, temp_jmbg, temp_lk);
			System.out.println("Unesite broj racuna");
			temp_brojRacuna = sc.next();
			ljudi[i] = new Racun(temp_brojRacuna, klient[i]);
			System.out.println(ljudi[i]);
			Intesa.dodajRacun(ljudi[i]);
		}
		Racun r = Intesa.getRacun("160-2135-27");
		if (r != null) {
			System.out.println(r.getStanje());
		} else
			System.out.println("Ne postoji takav racun!!!");
	}

}
