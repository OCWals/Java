
public class Ville {
	
	// Variables de classe :
	public static int nbInstances = 0;					// Une variables de classe est toujours d�clar�e "static"
	protected static int nbInstancesBis = 0;
	
	// Variables d'instances :
	protected String nomVille;
	protected String nomPays;
	protected int nbHabitants;
	protected char categorie;
	
	// CONSTRUCTEURS :
	public Ville() {
		System.out.println("Cr�ation d'une nouvelle ville...");
		this.nomVille = "Inconnu";
		this.nomPays = "Inconnu";
		this.nbHabitants = 0;
		this.setCategorie();
		nbInstances += 1;
		nbInstancesBis += 1;
	}
	
	public Ville(String ville, String pays, int habitants) throws NbHabitantsException, NomVilleException {
			if (habitants<0) {
				throw new NbHabitantsException (habitants);
			}
			if (ville.length()<3) {
				throw new NomVilleException("Le nom de la ville doit faire plus de 3 carract�res (vous avez entr� \"" + ville + "\") !");
			} else {
				this.nomVille = ville;
				this.nomPays = pays;
				this.nbHabitants = habitants;
				this.setCategorie();
				nbInstances += 1;
				nbInstancesBis += 1;
				System.out.println("Cr�ation d'une nouvelle ville...");
			}
	}
	
	// GETTEURS :
	public String getNom() {
		return this.nomVille;
	}
	
	public String getPays () {
		return this.nomPays;
	}
	
	public int getNbHab () {
		return this.nbHabitants;
	}
	
	public char getCategorie() {
		return this.categorie;
	}
	
	public static int getNbInstances () {					// Toutes les m�thodes de classe n'utilisant que des variables de classe sont declar�es static"
		return nbInstancesBis;
	}
	
	// SETTERS :
	public void setNom(String pNom) {
		this.nomVille = pNom;
	}
	
	public void setPays (String pPays) {
		this.nomPays = pPays;
	}
	
	public void setNbHab (int pNbHab) {
		this.nbHabitants = pNbHab;
		this.setCategorie();
	}
	
	private void setCategorie () {
		if (this.nbHabitants < 1000) {
			this.categorie = 'A';
		} else if (this.nbHabitants >= 1000 && this.nbHabitants < 10000) {
			this.categorie = 'B';
		} else {
			this.categorie = 'C';
		}
	}
	
	// AUTRES METHODES :
	
	public void comparerHab (Ville v) {
		int a = this.getNbHab();
		int b = v.getNbHab();
		if (a == b)
			System.out.println(this.getNom() + " et " + v.getNom() + " ont le m�me nombre d'habitants, soit  " + a + ".");
		else if (a > b)
			System.out.println(this.getNom() + " a plus d'habitants que " + v.getNom() + ", " + a + " contre " + b + " habitants.");
		else 
			System.out.println(this.getNom() + " a moins d'habitants que " + v.getNom() + ", " + a + " contre " + b + " habitants.");
	}
	
	public String description() {
		return "\nVille : " + this.getNom() + "\nPays : " + this.getPays() + "\nPopulation : " + this.getNbHab() + " habitant(s)\nCat�gorie : " + this.getCategorie() + "\n";
	}
	
	public String toString(){
		  return this.nomVille+" est une ville de "+this.nomPays+" qui comporte "+this.nbHabitants+" habitants et est donc de cat�gorie "+this.categorie+".";
	}
	
	
	
	
	
	
	
}
