package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i : tabell) {
			 
			System.out.println(i);
			}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String temp="[";
		
		if (tabell.length >0) {
		for (int i=0;i < tabell.length-1;i++) {
			temp +=tabell[i]+",";
			}
		temp+=tabell[tabell.length-1];
		temp += "]";
		return temp;
		} else {
			temp ="[]";
			return temp;
		}
		
	}

	// c)
	public static int summer(int[] tabell) {

		int sum=0;
		for (int i=0;i<tabell.length;i++) {
			sum +=tabell[i];
			
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean samme=false;
		for (int i=0;i<tabell.length;i++) {
			
			samme = tall == tabell[i];
		if (samme == true) {
			return samme;
		}
		
		} return samme;	

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		boolean samme=false;
		for (int i=0;i<tabell.length;i++) {
		
			samme = tall == tabell[i];
			if (samme == true) {
				return i;
			}
	
		} return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] omvendt =new int[tabell.length];
		for (int i=0;i<tabell.length;i++) {
			
			omvendt[i]=tabell[(tabell.length-1)-i];
		
		} return omvendt;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean stigende=true;
		int temp=0;
		int forrige=0;
		
		for (int i=0; i<tabell.length && stigende==true;i++) {
			
			temp=tabell[i];
			stigende= temp>forrige;
			forrige=temp;
		
		} return stigende;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] nyTab= new int[tabell1.length + tabell2.length];
		
		for (int i=0;i<tabell1.length;i++) {
		
			nyTab[i]=tabell1[i];
		} 
	
		for (int i=0;i<tabell2.length;i++) {
		
			nyTab[tabell1.length +i]=tabell2[i];
		
		} return nyTab;
	}
}
