package Zadatak_01_0309;

public class GlavniProgram {

	public static void main(String[] args) {
		// Napisati glavni program, gde cete testirati kako ove klase funkcionisu.
		
		Sportista ovie = new Sportista("Alexandr", "Ovechkin", 1985);
		Sportista wayne = new Sportista("Wayne", "Gretzky", 1958);
		Sportista hagel = new Sportista ("Carl", "Hagelin", 1980);
		
		Sportista[] capitalsi = {ovie, hagel, wayne};
		
		Klub wash = new Klub("Capitals", "Washington", 1950, capitalsi);
		
		Sportista staal = new Sportista("Mark", "Staal", 1984);
		Sportista mika = new Sportista("Mika", "Zibanejad", 1990);
		Sportista kaapo = new Sportista ("Kaapo", "Kakko", 1984);
		Sportista tony = new Sportista ("Tony", "DeAngelo", 1980);
		
		Sportista[] rangers = {staal, mika, kaapo, tony};
		
		Klub nyrangers = new Klub("NY Rangers", "New York", 1950, rangers);

		System.out.println(wash);
		System.out.println(nyrangers);
		System.out.println(wash.getSportista(2));
		System.out.println(nyrangers.getSportista(3).getGodiste());
		System.out.println(wash.getNaziv());
		wash.setNaziv("Washington Capitals");
		System.out.println(wash.getNaziv());
		
	}

}
