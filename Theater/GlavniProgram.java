package Zadatak_02_0313;

public class GlavniProgram {

	public static void main(String[] args) {
		Pozoriste p1 = new Pozoriste ("JDP");
		Pozoriste p2 = new Pozoriste ("Narodno pozoriste"); 
		
		Zaposleni z1 = new Zaposleni ("Jovan Jovanovic", p1);
		Zaposleni z2 = new Zaposleni ("Marina Maric", p1);
		Zaposleni z3 = new Zaposleni ("Ivana Ilic", p1);
		Zaposleni z4 = new Zaposleni ("Marko Markovic", p2);
		Zaposleni z5 = new Zaposleni ("Zdravko Zdravkovic", p2);
		Zaposleni z6 = new Zaposleni ("Nenad Nenadovic", p2);
		Zaposleni z7 = new Zaposleni ("Dragan Micanovic", p1);
		
		
		Glumac g1 = new Glumac(z7.getImePrezime(), z7.getPozoriste(),"glavna uloga");
		Glumac g2 = new Glumac (z1.getImePrezime(), z1.getPozoriste(), "sporedna uloga");
		Glumac g3 = new Glumac (z3.getImePrezime(), z3.getPozoriste(), "sporedna muska uloga");
		System.out.println(g1);
		System.out.println(g2);
		
		Reditelj r1 = new Reditelj (z2.getImePrezime(), z2.getPozoriste(), "Mara");
		Reditelj r2 = new Reditelj (z5.getImePrezime(), z5.getPozoriste(), "Ivancica");
		System.out.println(r1);
		System.out.println(r2);
		
		Predstava pred1 = new Predstava ("Skakavci", p1);
		Predstava pred2 = new Predstava ("Razbijeni krcag", p2);
		
		pred1.dodajZaposlenog(r1);
		pred1.dodajZaposlenog(g1);
		pred1.dodajZaposlenog(g2);
		pred1.dodajZaposlenog(g3);
		System.out.println(pred1);
		pred1.ukloniZaposlenog(g3);
		System.out.println(pred1);

	}

}
