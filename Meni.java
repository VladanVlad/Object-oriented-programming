package zadatak_2;

import java.util.ArrayList;

public class Meni {

	private ArrayList<Jelo> meni;
	private Supa supa;

	public Meni() {
		this.meni = new ArrayList<Jelo>();
	}

	public void addJelo(Jelo jelo) {
		this.meni.add(jelo);
	}

	@Override
	public String toString() {
		if (meni.size()==0) {
			return null;
		}
		String temp = meni.get(0).toString();
		for (int i = 1; i<meni.size(); i++) {
			temp+= "\n" + meni.get(i).toString();
		}
		return temp;
	}
}
