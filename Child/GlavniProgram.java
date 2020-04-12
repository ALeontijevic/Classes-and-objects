package Zadatak_01_0313;

public class GlavniProgram {

	public static void main(String[] args) {
		Dete d1 = new Dete ("Kosta", "Trpkov", 5, 20);
		Dete d2 = new Dete ("Jovan" ,"Leontijevic", 14, 50);
		Dete d3 = new Dete ("Lenka", "Robovic", 3, 15);
		
		d1.dodajKlikere(15);
		System.out.println(d1.getKlikeri());
		System.out.println(Dete.getGlobalKlikeri());
		d3.oduzmiKlikere(4);
		System.out.println(d3.getKlikeri());
		System.out.println(Dete.getGlobalKlikeri());
		System.out.println(Dete.prosekGodina());
		

	}

}
