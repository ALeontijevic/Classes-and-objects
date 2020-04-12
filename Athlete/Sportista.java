package Zadatak_01_0306;

import java.util.Scanner;

public class Sportista {
	/*
	 * Napisati klasu Sportista. Sportista ima 1) ime i prezime (polje tipa String)
	 * koje moze da se dohvati, ali ne i postavi 2) sport kojim se bavi (polje tipa
	 * String) koje moze da se dohvati ali ne i postavi 3) klub za koji igra (polje
	 * tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji
	 * igra. 4) broj koji nosi na dresu (neka u ovom zadatku bude tipa int) koje
	 * moze i da se dohvati i da se postavi.
	 * 
	 * Napisati glavni program koji kreira tri igraca. U glavnom programu
	 * iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi
	 * Sportista.
	 * 
	 */

	private String imePrez;
	private String sport;
	private String klub;
	public int broj;

	public Sportista(String a, String b, String c, int d) {
		Scanner sc = new Scanner(System.in);
		imePrez = a;
		sport = b;
		klub = c;
		while (d < 0 || d >= 100) {
			System.out.println("Pogresan unos, pokusajte ponovo.");
			d = sc.nextInt();
		}
		broj = d;
	}

	public String promeniKlub() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite nov naziv kluba: ");
		klub = sc.nextLine();
		System.out.println("Uspesno promenjen klub.");
		return klub;
	}

	public void dohvatiPolje() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite polje koje zelite da procitate: ");
		String a = sc.nextLine().toLowerCase();

		while (!a.equals("ime i prezime") && !a.equals("klub") && !a.equals("broj dresa") && !a.equals("sport")) {
			System.out.println("Pogresan unos polja. Pokusajte ponovo: ");
			a = sc.nextLine().toLowerCase();
		}

		switch (a) {
		case "klub":
			System.out.println(klub);
			return;
		case "ime i prezime":
			System.out.println(imePrez);
			return;
		case "sport":
			System.out.println(broj);
			return;
		case "broj dresa":
			System.out.println(broj);
			return;
		}
	}

}
