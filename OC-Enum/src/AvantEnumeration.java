
public class AvantEnumeration {
	public static final int PARAM1 = 1;
	public static final int PARAM2 = 2;
	
	public void fait(Langage param) {
		if (param.equals(Langage.JAVA)) {
			System.out.println("Fait avec du JAVA.");
		} else if (param.equals(Langage.PHP)) {
			System.out.println("Fait avec du PHP.\n");
		}
	}
	
	public static void main(String argus[]) {
		AvantEnumeration ae = new AvantEnumeration();
		ae.fait(Langage.JAVA);
		ae.fait(Langage.PHP);
				
		for(Langage lang : Langage.values()) {			
			if (Langage.JAVA.equals(lang)) {
				System.out.println("\nJ'aime le : \n* " + lang.toString());
			} else {
				System.out.println("* " + lang.toString());
			}
		}
	}
}
