package Zadatak_01_0312;

public class GlavniProgram {

	public static void main(String[] args) {
	
		Vozac v1 = new Vozac("Milivoj", "Jevtic", "sofer");
		Vozac v2 = new Vozac("Dragisa", "Peric", "vozac");

		Putnik p1 = new Putnik("Milan", "Milenkovic", 334.5);
		Putnik p2 = new Putnik("Rada", "Petrovic", 1000);
		Putnik p3 = new Putnik("Mitar", "Mitrovic", 2000);
		Putnik p4 = new Putnik("Jovan", "Jovanovic", 850);
		
		Autobus a1 = new Autobus ("StrelaUb", 400.50);
		Autobus a2 = new Autobus ("Lasta Valjevo", 500.60);
		
		a1.dodajPutnika(p1);
		a1.dodajPutnika(p2);
		a1.dodajPutnika(p3);
		a1.dodajPutnika(p4);
		System.out.println(p1);
		System.out.println(a1);
		
		a1.naplati();
		a1.dodajVozaca(v1);
		a1.naplati();
		System.out.println(a1);
		
		a2.dodajPutnika(p2);
		a2.dodajPutnika(p2);
		System.out.println(a2);
		a2.naplati();
		a2.dodajVozaca(v2);
		a2.naplati();
		System.out.println(a2);
		a2.ukloniVozaca(v2);
		a2.ukloniPutnika(p2);
		a2.dodajPutnika(p3);
		System.out.println(a2);
		
		
	}

}
