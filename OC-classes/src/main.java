
public class main {
	
	public static void println(String x) {
		System.out.println(x);
	}
	
	public static void print(String x) {
		System.out.print(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ville Grenoble = null;
		Ville NegCity = null;
		Ville ShortCity = null;
		Ville MultiCity = null;
		
		try {
			Grenoble = new Ville("Grenoble", "France", 700000);
		} catch (Exception e) {
		}
		println(Grenoble.toString() + '\n');

		try {
			NegCity = new Ville("Negatif City", "Nul-part", -71);
		} catch (Exception e) {
		} finally {
			if (NegCity == null) {
				NegCity = new Ville();
			}
		}		
		println(NegCity.toString() + "\n");
	
		try {
			ShortCity = new Ville("ST", "Nul-part", 701);
		} catch (Exception e) {
			println(e.getMessage());
		} finally {
			if (ShortCity == null) {
				ShortCity = new Ville();
			}
		}
		println(ShortCity.toString() + "\n");
		
		try {
			MultiCity = new Ville("MC", "France", 50);
		}
		catch (NbHabitantsException e) {
		} catch (NomVilleException e2) {
			println(e2.getMessage());
		}
		finally {
			if (MultiCity == null) {
				MultiCity = new Ville();
			}
		}
		println(MultiCity.toString() + "\n");
		
		
	}
}
