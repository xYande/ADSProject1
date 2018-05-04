/**Java-Programm, das zwei ganze Zahlen über die Kommandozeile einlist 
 * und die Anzahl aller k-elemntigen Teilmengen einer 
 * n-elementigen Menge
 * auf zwei verschiedene Arten berechnet und das Ergebnis ausgibt,
 * auch bekannt als Binomialkoeffizienten (n über k).
 */

/**
 * @author lisa-marie kaiser
 * @version 28.04.2018
 */
public class Aufg2 {


	public static void main (String[] args) {
		
		//while (true) {
			System.out.println("Geben Sie eine ganze Zahl ein.");
			long n = StaticScanner.nextInt();
			System.out.println("Geben Sie eine weiere ganze Zahl ein.");
			long k = StaticScanner.nextInt();
			
			long ergebnis1 = bincoef1(n, k);
			System.out.println("Ergebnis der ersten Variante: " + ergebnis1);
			
			long ergebnis2 = bincoef2(n, k);
			System.out.println("Ergebnis der zweiten Variante: " + ergebnis2);
			//break;
		//}
	}
	
	public static long bincoef1 (long n, long k) {
		if (k == 0 || k == n) {
			return 1;
		} else if (k > n) {
			return 0;
		} else {
			return bincoef1(n-1, k-1) + bincoef1(n-1, k);
		}
	}
	
	public static long bincoef2 (long n, long k) {
		if (k == 0 || k == n) {
			return 1;
		} else if (k > n) {
			return 0;
		} else {
			return bincoef2(n/k, 0) * bincoef2(n-1, k-1);
		}
	}
}
