package Zadatak_01_0313;

import java.util.ArrayList;

public class Dete {
	/*
	 * Dete ima ime, prezime, broj godina i broj klikera. Napraviti mogucnost da se
	 * kreira vise objekata klase Dete. Ako se pozove metoda dodajKlikere ili metoda
	 * oduzmiKlikere, broj klikera se azurira. Napraviti metodu koja ce ispisivati
	 * broj klikera i metodu koja ispisuje prosecan broj decjih godina(ako imamo
	 * troje dece, broj prosecnih godina za njih troje; ako imamo dvoje racunamo
	 * prosecne godine za to dvoje) .
	 * 
	 */

	private String ime;
	private String prezime;
	private int godine;
	private static int globalKlikeri;
	private int brKlikera;
	private static ArrayList <Dete> deca=new ArrayList <Dete>();

	public Dete(String ime, String prezime, int godine, int brKlikera) {
		this.brKlikera = brKlikera;
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
		globalKlikeri += brKlikera;
		deca.add(this);
	}

	public void dodajKlikere(int a) {
		if (a <= 0) {
			System.out.println("Nedozvoljen unos.");
			return;
		} else {
			brKlikera += a;
			globalKlikeri += a;
		}
	}

	public void oduzmiKlikere(int a) {
		if (a>brKlikera) {
			System.out.println("Greska. Uneli ste nedozvoljenu kolicinu klikera.");
			return;
		}
		else {
			brKlikera -= a;
			globalKlikeri -= a;
		}
	}
	
	public int getKlikeri() {
		return brKlikera;
	}
	
	public int getGodine() {
		return godine;
	}

	public static int getGlobalKlikeri() {
		return globalKlikeri;
	}
	
	public static double prosekGodina() {
		int sum=0;
		for (int i=0; i<deca.size(); i++) {
			sum+=deca.get(i).getGodine();
		}
		return sum/deca.size();
	}
}
