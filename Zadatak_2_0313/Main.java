package Zadatak_2_0313;

public class Main {

	public static void main(String[] args) {
		Pozoriste ime = new Pozoriste("Jugoslovensko dramsko");
		Reditelj prvi = new Reditelj("Marko Nikolic", ime, "Luk");
		Glumac glavni = new Glumac("Glogovac Nebojsa", ime, "Jago");
		Glumac prateci = new Glumac("Matic Dejan", ime, "Otelo");
		Glumac prateci2 = new Glumac("Djordjevic Ivana", ime, "Ivka");
		Predstava otelo = new Predstava("Otelo", ime);
		otelo.addZaposleni(prvi);
		otelo.addZaposleni(glavni);
		otelo.addZaposleni(prateci);
		otelo.addZaposleni(prateci2);
		System.out.println(otelo);
		
		Pozoriste ime2 = new Pozoriste("Narodno pozoriste");
		Reditelj mainMen = new Reditelj("Nick Sloter", ime2, "Killer");
		Glumac glavna = new Glumac("Marina Martic", ime2, "Prava");
		Glumac prateciGl = new Glumac("Marko Otic", ime2, "Voljeni");
		Glumac prateciG = new Glumac("Karlo Katic", ime2, "Prvi");
		Predstava mario = new Predstava("Maria", ime2);
		mario.addZaposleni(mainMen);
		mario.addZaposleni(glavna);
		mario.addZaposleni(prateciGl);
		mario.addZaposleni(prateciG);
		System.out.println(mario);
		
	}

}
