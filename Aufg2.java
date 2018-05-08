/**Java-Programm, das zwei ganze Zahlen über die Kommandozeile einliest 
 * und die Anzahl aller k-elementigen Teilmengen einer 
 * n-elementigen Menge
 * auf zwei verschiedene Arten berechnet und das Ergebnis ausgibt,
 * auch bekannt als Binomialkoeffizienten (n über k).
 
 * @author lisa-marie kaiser, alexander bopp, felix fuhrmann
 * @version 28.04.2018
 */
public class Aufg2 {


	public static void main (String[] args) {
	
		long n = Long.parseLong(args[0]);
		long k = Long.parseLong(args [1]);
		
		long ergebnis1 = bincoef1(n, k);									//Aufruf der ersten Rechen-Methode
		System.out.println("Ergebnis der ersten Variante: " + ergebnis1);
		
		long ergebnis2 = bincoef2(n, k);									//Aufruf der zweiten Rechen-Methode
		System.out.println("Ergebnis der zweiten Variante: " + ergebnis2);
	}
	
	/**	Erste rekursive Funktion zur Berechnung des Binomialkoeffizienten
	 * 	mit bestimmten Berechnungsvorschriften.
	 * 
	 * @param n Erste ganze Zahl
	 * @param k Zweite ganze Zahl 
	 * @return Gibt den Binomialkoeffizienten aus
	 */
	public static long bincoef1 (long n, long k) {
		if (k == 0 || k == n) {								
			return 1;
		} else if (k > n) {									
			return 0;
		} else {
			return bincoef1(n-1, k-1) + bincoef1(n-1, k); 	//Rekursion
		}
	}
	
	/** Zweite rekursive Funktion zur Berechnung des Binomialkoeffizienten
	 * 	mit anderen Berechnungsvorschriften.
	 * 
	 * @param n Erste ganze Zahl
	 * @param k Zweite ganze Zahl 
	 * @return Gibt den Binomialkoeffizienten aus
	 */
	public static long bincoef2 (long n, long k) {
		if (k == 0 || k == n) {
			return 1;
		} else if (k > n) {
			return 0;
		} else {
			return bincoef2(n-1, k-1) * n/k;	//Rekursion
		}
	}
}
