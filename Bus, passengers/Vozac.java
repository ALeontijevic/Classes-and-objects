package Zadatak_01_0312;

public class Vozac extends Covek{
	// Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
	private String zvanje;
	
	public Vozac(String ime, String prezime, String zvanje) {
		super (ime, prezime);
		this.zvanje = zvanje;
	}
	
	public String getZvanje() {
		return zvanje;
	}
	
	public String toString() {
		return super.toString();
	}

}
