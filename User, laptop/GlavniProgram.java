package ucionica;

public class GlavniProgram {

	public static void main(String[] args) {
		Polaznik p1 = new Polaznik ("Maja Mladenovic");
		Polaznik p2 = new Polaznik ("Kosta Trpkov");
		Polaznik p3 = new Polaznik ("Zvezdan lazic");
		Polaznik p4 = new Polaznik ("Petar Petrovic");
		
		Laptop lt1 = new Laptop ("Lenovo");
		
		lt1.dodajPolaznika(p1);
		lt1.dodajPolaznika(p2);
		lt1.dodajPolaznika(p3);
		lt1.dodajPolaznika(p4);
		
		System.out.println(lt1);
		
		System.out.println(p4.getImePrezime());
		lt1.ukloniPolaznika(3);
		System.out.println(lt1);
		System.out.println(p2);

	}

}
