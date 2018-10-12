
public enum Langage {
	JAVA ("Lanage JAVA"),
	C ("Langage C"),
	CPlus ("Langage C++"),
	PHP ("Langage PHP"),
	HTML5 ("Langage HTML5"),
	CSS3 ("Langage CSS3");
	
	private String name = ""; 
	
	// CONSTRUCTEURS :
	Langage(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	/* Chacun de ses langage est en fait un "objet" de la classe java.lang.Object sur lesquels on peu par exemple utiliser toString() */
}
