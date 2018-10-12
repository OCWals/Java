
public class Capitale extends Ville {
	
	// VARIABLES DE CLASSE :
	private String monument;
	
	
	// CONSTRUCTEURS :
	Capitale () {
		super();
		monument = "N/A";
	}
	
	Capitale (String pNom, String pNomPays, int pHab, String pMonument) {
		// super(pNom, pNomPays, pHab);
		this.monument = pMonument;
	}

	
	// GETTERS :
	public String getMonument() {
		return monument;
	}

	
	// SETTERS :
	public void setMonument(String monument) {
		this.monument = monument;
	}
	
	
	// AUTRES METHODES :
	
	public String description () {
		return super.description() + "Monument : " + this.monument;
	}
}
