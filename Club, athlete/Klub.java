package Zadatak_01_0309;

import java.util.Arrays;

public class Klub {

	/*
	 * Klub poseduje naziv, sediste (grad), godinu osnivanja i niz sportista tipa
	 * Sportista. Sva polja mogu da se dohvate, a naziv kluba moze i da se postavi.
	 * Napisati metodu koja ce ispisati ceo objekat klase klub.
	 */
	private String naziv;
	private String sediste;
	private int godOsnivanja;
	private Sportista[] sportista = new Sportista[10];

	public Klub(String naziv, String sediste, int godOsnivanja, Sportista sportista[]) {
		this.naziv = naziv;
		this.sediste = sediste;
		this.godOsnivanja = godOsnivanja;
		this.sportista = sportista;
		
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String a) {
		naziv = a;
	}

	public String getSediste() {
		return sediste;
	}

	public int getGodOsnivanja() {
		return godOsnivanja;
	}

	public Sportista getSportista(int n) {
		return sportista[n];
	}

	public String toString() {
		return naziv+" "+sediste+" "+godOsnivanja+" "+Arrays.toString(sportista);
	}
}
