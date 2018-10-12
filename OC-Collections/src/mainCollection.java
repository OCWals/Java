import java.util.*;					// importe toutes les classes contenues dans java.util

public class mainCollection {
	public static void main (String[] args) {
		System.out.println("Test okay\n");
		
		List list01 = new LinkedList();

		list01.add("Debut.");
		list01.add(12);
		list01.add("Toto !");
		list01.add(12.20f);
		list01.add(null);
		list01.add("Fin.");
		
		for (int i=0; i<list01.size(); i++) {				// utiliser size() et non length()
			int j = i + 1;
			System.out.println("Element contenu dans l'index n�" + j + " : " + list01.get(i));
		}
		
		System.out.print('\n');
		
		ListIterator li = list01.listIterator();
		
		System.out.println(list01.get(list01.size()-1));
		
		System.out.print("\n");
		
		int i = 0;
		while (li.hasNext()) {
			System.out.println(i + " : " + li.next());
			i = i+1;
		}
		
		System.out.println("\n*-------------------------------------------------------*\n");
		
		/* L'objet ArrayList fonctionne exactement de la m�me mani�re � la diff�rence qu'il est plus rapide en lecture et ce m�me pour un gros volume de donn�es
		Privilegier le LinkedList lorsqu'il faut ajouter ou supr des donn�es en millieu de liste. */
	
		
		Hashtable ht = new Hashtable();
		
		ht.put(1, "Printemps");
		ht.put(3, "Et�");
		ht.put(7, "Automne");
		ht.put(9, "Hiver");
		// ht.put(16, null);
		
		Enumeration e = ht.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		System.out.println("\n" + ht.containsValue("Hiver"));
		
		/* L'objet Hashtable n'accepte pas la valeur null
		Utiliser plutot l'objet HashMap pour ca qui fonctionne exactement pareil � la diff�rence d'accepter la valeur null */
		
		System.out.println("\n*-------------------------------------------------------*\n");
		
		HashSet hs = new HashSet();

		hs.add("toto");
		hs.add(12);
		hs.add(null);
		hs.add("Winter is coming");
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("");
		
		Object[] obj = hs.toArray();
		
		for (Object o : obj) {
			System.out.println(o);
		}
		
		/* Les set sont un peu comme les List mais adapt� � la manipulation d'un grand nombre d'objet.
		Attention pour inserer des donn�es de maniere ordon�e, utiliser une list */
	}
}
