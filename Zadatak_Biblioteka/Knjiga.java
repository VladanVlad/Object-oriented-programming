package Zadatak_Biblioteka;

public class Knjiga {
	private String naziv;
	private Autor autor;
	private int brStrana;
	private int godIzdanja;
	private int id;
	private static int globalId=0;
	
	public Knjiga(String naziv, Autor autor, int brStrana, int godIzdanja) {
		super();
		this.naziv = naziv;
		this.autor = autor;
		this.brStrana = brStrana;
		this.godIzdanja = godIzdanja;
		this.id=globalId;
		globalId++;
	}

	public Autor getAutor() {
		return autor;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getBrStrana() {
		return brStrana;
	}

	public int getGodIzdanja() {
		return godIzdanja;
	}

	public void setGodIzdanja(int godIzdanja) {
		this.godIzdanja = godIzdanja;
	}
	
	public static int getGlobalId() {
		return globalId;
	}
	
	
	
}
