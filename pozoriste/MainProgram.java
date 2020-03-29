package pozoriste;

public class MainProgram {

	public static void main(String[] args) {
		Pozoriste jdp = new Pozoriste("Jugoslovensko dramsko pozoriste");
		Glumac vodeci = new Glumac("Nebojsa Glogovac", jdp, "Otelo");
		Glumac vodeca = new Glumac("Katarina Radivojevic", jdp, "Dezdemona");
		Glumac prateci = new Glumac("Anica Dobra", jdp, "Bjanka");
		Reditelj pravi = new Reditelj("Dragan Bjelogrlic", jdp, "Beli");
		Predstava otelo = new Predstava("Otelo", jdp);
		
		otelo.addZaposleni(vodeci);
		otelo.addZaposleni(vodeca);
		otelo.addZaposleni(prateci);
		otelo.addZaposleni(pravi);
		
		System.out.println(otelo.toString());

	}

}
