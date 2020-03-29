package zadatak_2;
public class Glavna {

	public static void main(String[] args) {
		Jelo neko = new Jelo("Pecenje");
		Meni restoran = new Meni();
		neko.dodajSastojak(new Sastojak("Secer", 50), 300);
		neko.dodajSastojak(new Sastojak("Cackalica", 30), 5);
		restoran.addJelo(neko);
		restoran.addJelo(neko);
		restoran.addJelo(neko);
		System.out.println(restoran.toString());
		Sastojak s1 = new Sastojak("batak", 500);
		Sastojak s2 = new Sastojak("sargarepa", 150);
		Sastojak s3 = new Sastojak("voda", 0);

		Supa pileca = new Supa("pileca supa", 130);
		pileca.dodajSastojak(s1, 400);
		pileca.dodajSastojak(s2, 200);
		pileca.dodajSastojak(s3, 800);

		Sastojak margarin = new Sastojak("margarin", 400);
		Sastojak cokolada = new Sastojak("cokolada", 1000);
		Sastojak brasno = new Sastojak("brasno", 500);
		Sastojak secer = new Sastojak("secer", 500);
		
		Torta cokoladna = new Torta("cokoladna torta");
		cokoladna.dodajSastojak(margarin, 250);
		cokoladna.dodajSastojak(cokolada, 300);
		cokoladna.dodajSastojak(brasno, 300);
		cokoladna.dodajSastojak(secer, 250);

		System.out.println("Sastojci za cokoladnu tortu kostaju: " + cokoladna.cenaJela() + " dinara.");
		System.out.println("Procenat secera je " + cokoladna.getProcenatSecera()*100 + "%");
		
		Meni meni = new Meni();
		meni.addJelo(pileca);
		meni.addJelo(cokoladna);
		meni.addJelo(neko);
		System.out.println(meni);
	}

}
