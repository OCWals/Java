
public class NbHabitantsException extends Exception {
	public NbHabitantsException() {
		System.out.println("Vous essayez d'instancier une ville avec un nombre néagatif d'habitants !");
	}
	
	public NbHabitantsException(int nbHab) {
		System.out.println("Vous essayez d'instancier une ville avec " + nbHab + " habitants, c'est un nombre néagatif !");
	}
	
}
