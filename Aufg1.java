/**Java-Programm, welches zwei ganze Zahlen über die Kommandozeile einliest, 
 * um diese Zahlen mit der angegebenen Methode zu multiplizieren
 * und das Ergebnis mit Anzahl der Iterationsschleifen ausgibt.

 * @author felix fuhrmann, lisa-marie kaiser, alexander bopp
 * @version 28.04.2018
 */

public class Aufg1 {

	public static void main(String[] args) {		
		
		int eingabex = Integer.parseInt(args[0]);
		int eingabey = Integer.parseInt(args [1]);
		
		if ((eingabex < eingabey) && (eingabex > 0) && (eingabey > 0)) {							//Kontrolle der Zahlen 
			eingabey = multi(eingabex, eingabey);													//Aufruf der multi-Methode
		} else {
			eingabey = multi(eingabey, eingabex);
		}
	}
	
	/** Methode zur Multiplikation von zwei ganzen Zahlen mit dem 
	 * 	Multiplikationsverfahren der Ägypter.
	 * 
	 * @param x Erste ganze Zahl
	 * @param y Zweite ganze Zahl 
	 * @return	Ergebnis der Multiplikation
	 */
	public static int multi(int x, int y) {
		int counter = 0;
		int ergebnis = 0; 
		
		if ((x % 2) != 0) {
			ergebnis += y;
		}
		while (x != 1) {
			x = x / 2;							
			y = y * 2;
			counter ++;	
		}
		ergebnis += y;
		
		System.out.println("Das Ergebnis ist " + ergebnis + ".");
		System.out.println("Schleifendurchläufe: " + counter);
		return ergebnis;	
	}
}
