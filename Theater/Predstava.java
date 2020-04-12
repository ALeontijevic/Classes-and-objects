package Zadatak_02_0313;

import java.util.ArrayList;

public class Predstava {
	/*
	 * * Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi
	 * zaposlene koji ucestvuju u realizaciji predstave. Zaposleni za realizaciju
	 * predstave mogu da se dodaju i izbace. Moze da se dohvati broj zaposlenih na
	 * predstavi. Sastavlja se tekstualni opis predstave navodeci naziv predstave i
	 * naziv pozorista u kojem se predstava odrzava razdvojene zarezom, a potom
	 * zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u
	 * zasebnom redu).
	 */

	private String naziv;
	private Pozoriste pozoriste;
	private ArrayList<Zaposleni> zaposleni;

	public Predstava(String naziv, Pozoriste pozoriste) {
		this.naziv = naziv;
		this.pozoriste = pozoriste;
		this.zaposleni = new ArrayList<Zaposleni>();
	}

	public void dodajZaposlenog(Zaposleni a) {
		zaposleni.add(a);
		System.out.println("Uspesno dodat zaposleni.");
	}

	public void ukloniZaposlenog(Zaposleni a) {
		zaposleni.remove(a);
		System.out.println("Uspesno uklonjen zaposleni.");
	}

	public int brZaposlenih() {
		return zaposleni.size();
	}

	public String toString() {
		
		StringBuilder st = new StringBuilder();
		st.append(naziv).append(", ").append(pozoriste.getNaziv());
		st.append("\n");
		for (int i = 0; i < zaposleni.size(); i++) {
			st.append(zaposleni.get(i)).append("\n");
		}

		return st.toString();

	}
}
