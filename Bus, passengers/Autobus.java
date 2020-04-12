package Zadatak_01_0312;

import java.util.ArrayList;

public class Autobus {
	/*
	 * Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime
	 * voze. Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je
	 * dodati/ukloniti putnika kao i vozaca. Moguce je naplatiti kartu putnicima
	 * samo ako je vozac prisutan. Autobus ispisati u sledecem obliku: Naziv ( vozac
	 * - Putnik1[novac], Putnik2 [novac],... )
	 */

	private String naziv;
	private Vozac vozac;
	private double cenaKarte;
	private ArrayList<Putnik> putnici;

	public Autobus(String naziv, double cenaKarte) {
		this.naziv = naziv;
		this.cenaKarte = cenaKarte;
		putnici = new ArrayList<Putnik>();
	}

	public void dodajVozaca(Vozac a) {
		this.vozac = a;
		System.out.println("Vozac je dodat.");
	}

	public void ukloniVozaca(Vozac a) {
		this.vozac = null;
		System.out.println("Vozac je uklonjen.");
	}

	public boolean ukloniPutnika(Putnik a) {
		for (int i = 0; i < putnici.size(); i++) {
			if (putnici.get(i) == a) {
				putnici.remove(i);
				System.out.println("Uspesno uklonjen putnik.");
				return true;
			}
		}
		System.out.println("Uneta osoba nije na spisku putnika.");
		return false;
	}

	public void dodajPutnika(Putnik a) {
		if (putnici.contains(a)) {
			System.out.println("Uneli ste osobu koja se vec nalazi na listi putnika.");
		} else {
			putnici.add(a);
			System.out.println("Uspesno dodat putnik");
		}
	}

	public void naplati() {
		if (vozac != null) {
			for (int i = 0; i < putnici.size(); i++) {
				putnici.get(i).uzmiNovac(cenaKarte);
			}
		} else
			System.out.println("Nemoguce naplatiti ukoliko vozac nije unet.");
		;
	}

	public String toString() {
		StringBuilder st = new StringBuilder();
		for (int i = 0; i < putnici.size() - 1; i++) {
			st.append(putnici.get(i)).append(", ");
		}
		return naziv + " (" + vozac + " - " + st + putnici.get(putnici.size() - 1) + ")";
	}

}
