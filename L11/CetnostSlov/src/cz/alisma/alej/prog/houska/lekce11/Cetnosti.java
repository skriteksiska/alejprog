package cz.alisma.alej.prog.houska.lekce11;

public class Cetnosti {
	private Slovo[] slova;
	private int delka;
	
	public Cetnosti() {
		delka = 0;
	}
	
	public void zapocitej(String a) {
		for (int i=0; i < delka; i++) {
			if (a.equals(slova[i].getVelikost())) {
				slova[i].zvysCetnost();
				return;
			}
		}

		delka++;
		Slovo[] pom = new Slovo[delka];
		for (int i=0; i < delka-1; i++) {
			pom[i] = new Slovo(this.slova[i].getVelikost());
			pom[i].setCetnost(this.slova[i].getCetnost());
		}
		pom[delka-1] = new Slovo(a);
		this.slova = pom;
	}

	public String[] seznamCisel() {
		String[] pom = new String[delka];
		for (int i=0; i < delka; i++) {
			pom[i] = this.slova[i].getVelikost();
		}
		return pom;
	}

	public int cetnost(int a) {
		return this.slova[a].getCetnost();
	}
}