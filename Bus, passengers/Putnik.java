package Zadatak_01_0312;

public class Putnik extends Covek {
	/*
	 * Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu
	 * novca koja mu se zadaje prilikom kreiranja.Odredjena svota novca moze da mu
	 * se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.
	 */

	private double novac;

	public Putnik(String ime, String prezime, double novac) {
		super(ime, prezime);
		this.novac = novac;
	}

	public boolean dodajNovac(double a) {
		if (a > 0) {
			novac += a;
			System.out.println("Uspesno ste dodali novac.");
			return true;
		} else {
			System.out.println("Nedozvoljen unos.");
			return false;
		}
	}

	public boolean uzmiNovac(double a) {
		if (a <= 0 || a > novac) {
			System.out.println("Pogresan unos.");
			return false;
		} else {
			novac -= a;
			return true;
		}

	}

	public double getNovac() {
		return novac;
	}

	public String toString() {
		return super.getIme() + " " + super.getPrezime() + "[" + novac + "]";
	}

}
