package ucionica;

public class Polaznik {
	/*
	 * Polaznik ima ime i prezime koje se zadaje prilikom kreiranja polaznika. Ime i
	 * prezime polaznika se moze dohvatiti ali ne i postaviti. Polaznik se ispisuje
	 * u obliku: IME_PREZIME.
	 */
	
	private String imePrezime;
	
	public Polaznik(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public String toString() {
		String[] imePrezime = this.imePrezime.split(" ");
		return imePrezime[0].toUpperCase()+"_"+imePrezime[1].toUpperCase();
	}

}
