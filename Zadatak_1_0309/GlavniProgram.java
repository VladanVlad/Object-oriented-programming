package Zadatak_1_0309;

import java.util.Scanner;

public class GlavniProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String temp_ime, temp_prezime;
		int temp_godiste;
		System.out.println("Koliko sportista zelite da unesete: ");
		int broj = sc.nextInt();
		Sportista[] tim = new Sportista[broj];
		for (int i = 0; i < broj; i++) {
			System.out.println("Unesite njegovo ime:");
			temp_ime = sc.next();
			System.out.println("Unesite njegovo prezime:");
			temp_prezime = sc.next();
			System.out.println("Unesite godinu rodjenja:");
			temp_godiste = sc.nextInt();
			tim[i] = new Sportista(temp_ime, temp_prezime, temp_godiste);
			System.out.println("Sportistin redni broj je: " + i);
		}

		String temp_klub, temp_sediste;
		int temp_osnovan;
		System.out.println("Unesite podatke za klub prema sledecem");
		System.out.println("Naziv kluba: ");
		temp_klub = sc.next();
		System.out.println("Sediste kluba: ");
		temp_sediste = sc.next();
		System.out.println("Godina osnivanja:");
		temp_osnovan = sc.nextInt();
		Klub klubInter = new Klub(temp_klub, temp_sediste, temp_osnovan, tim);
		
		System.out.println("Uspesno je kreiran klub: " + klubInter);
	}
}
