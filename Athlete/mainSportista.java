package Zadatak_01_0306;

public class mainSportista {

	public static void main(String[] args) {
		Sportista igrac1 = new Sportista("Marko Markovic", "hokej", "Washington Capitals", 20);
		Sportista igrac2 = new Sportista("Petar Petrovic", "fudbal", "Radncki Boljevac", 50);
		Sportista igrac3 = new Sportista("Mira Mirkovic", "bocanje", "Zenska posla", 88);
				
		igrac2.dohvatiPolje();
		igrac2.promeniKlub();
		igrac2.dohvatiPolje();
		igrac2.broj = 66;
		igrac2.dohvatiPolje();
		
		igrac1.dohvatiPolje();
		igrac1.broj = 99;
		igrac1.promeniKlub();
		igrac1.dohvatiPolje();
	}

}
