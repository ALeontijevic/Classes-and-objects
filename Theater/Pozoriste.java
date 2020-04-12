package Zadatak_02_0313;

public class Pozoriste {
	/*
	 * Pozoriste ima jednoznacan automatski generisan celobrojan identifikator i
	 * naziv koji mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku
	 * naziv[id].
	 */
	private static int globalId=1;
	private int id;
	private String naziv;
	
	public Pozoriste(String naziv) {
		this.naziv = naziv;
		id = globalId;
		globalId++;
	}

	public int getId() {
		return id;
	}
	
	public static int getGlobalId() {
		return globalId;
	}

	public String getNaziv() {
		return naziv;
	}
	
	public String toString() {
		return naziv+"["+id+"]";
	}
}
