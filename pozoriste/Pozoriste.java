package pozoriste;

public class Pozoriste {

	private String naziv;
	private static int globalId = 0;
	private int id;

	public Pozoriste(String naziv) {
		this.naziv = naziv;
		this.id = globalId;
		this.globalId++;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return naziv + " [" + id + "]";
	}

}
