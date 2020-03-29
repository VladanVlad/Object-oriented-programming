package Zadatak_Biblioteka;

public class Biblioteka {

	public static void main(String[] args) {
		Autor a = new Autor("pera", "Peric", 1990 );
		
		System.out.println(a);
		System.out.println(a.ispis());
		
		System.out.println(a.getIme());
		
		Knjiga k = new Knjiga("uvod u oop", a, 600, 2020);
		
		System.out.println(k.getAutor().getPrezime());
		System.out.println(Knjiga.getGlobalId());
	}

}
