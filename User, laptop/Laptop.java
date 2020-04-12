package ucionica;

import java.util.ArrayList;
import java.util.Arrays;

public class Laptop {
	/*
	 * Laptop poseduje listu polaznika koji ga koriste i marku koji se zadaju
	 * prilikom kreiranja. Marka moze samo da se dohvati. Lista polaznika koji
	 * koriste laptop moze da se prosiri i da se smanji. Moze da se ispise u obliku
	 * (koristiti metodu): MARKA{POLAZNIK 1, POLAZNIK 2,.....}
	 */
	private ArrayList<Polaznik> polaznici;
	private String marka;

	public Laptop(String marka) {
		polaznici = new ArrayList<Polaznik>();
		this.marka = marka;
	}

	public String getMarka() {
		return marka;
	}

	public void dodajPolaznika(Polaznik polaznik) {
		this.polaznici.add(polaznik);
	}

	public void ukloniPolaznika(int a) {
		polaznici.remove(a);
	}

	public String toString() {
		return marka.toUpperCase() + "{" + Arrays.toString(polaznici.toArray()).replace("[", "").replace("]", "") + "}";
	}
}
